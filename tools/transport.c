//****************************************************************************************************************************************************
//* Project: Protobuf compatible message protocol for STM32 (for FORPOST tagers)
//* Author: Alexander Lobas (alexanderlobas@yahoo.com)
//* File: transport.c - contains buffers and procedure that shoud be used to send data over communication chanels (like UART, UDP\TCP) or others
//*                    if you want to add new 
//*                    
//****************************************************************************************************************************************************

//#define ARM_MATH_CM3
#include "transport.h"
#include "protolib.h"

#if defined (STM32F103xE)
#include "stm32f1xx_hal.h" 
#include "cmsis_armcc.h"
#define assert(X)
#elif defined(STM32F103xB)
#include "stm32f1xx_hal.h"
#define assert(X)
#elif defined (STM32F030x8) || defined(STM32F091xC)
#include "stm32f0xx_hal.h"
#include "cmsis_armcc.h"
#define assert(X)
#else
#include <assert.h>
#endif


bool DefaultWriteAllocator(CyclicBuffer* buf, const CommandDescr* cmd, MemStream* stream, uint32_t pack_size)
{
	return CBufReserveAtomic(buf, pack_size, stream);
}


bool BinCommandWritter(MemStream* stream, const CommandDescr* cmd, const void* msg, uint32_t flat_size)
{	
	WritePacked32(stream, cmd->cmdId);
	WritePacked32(stream, flat_size);

	if (flat_size > 0)
	{
		size_t param_pos = stream->pos;
		WriteMessage(stream, msg, cmd->msgDescr);

		assert(!stream->has_error);
		assert(stream->pos == stream->end);

		if (stream->has_error || stream->pos != stream->end) // #TODO: deallocate buffer if possible
		{
			//CBufClear(buf);
			stream->pos = param_pos;
			//		stream.has_error = false;
			ZeroFill(stream);
			return false;
		}
	}
	
	return true;
}


bool SendMessage(ProtoDescr* proto, const void* msg, const CommandDescr* cmdDescr)
{
	CyclicBuffer* buf  = proto->sendBuffer;
	volatile uint32_t flat_size = GetMessageDataSize(msg, cmdDescr->msgDescr);
	volatile uint32_t buf_size  = GetPackedSize32(cmdDescr->cmdId) + GetPackedSize32(flat_size) + flat_size;

  MemStream stream = { 0 };
	stream.has_error = false;
	if (!proto->WriteAllocator(buf, cmdDescr, &stream, buf_size))
	{
		if (stream.has_error || stream.pos != stream.end) //#TODO see BinCommandWritter
			CBufClear(buf);
		return false;
	}
	
	DirectSendFunc sendFn = proto->DirectSend;
	if (sendFn == NULL)
		return proto->Writter(&stream, cmdDescr, msg, flat_size);
	else
	{
    bool is_success = proto->Writter(&stream, cmdDescr, msg, flat_size) && sendFn(buf->data, buf->wpos);
    CBufClear(buf);
    return is_success;
	}
}


void BinCommandReader(MemStream* stream, void* message_ptr, const MessageDescr* descr, ArenaAllocator* arena)
{
	ReadMessage(stream, message_ptr, descr, arena);
}


int BinCommandSplitter(MemStream* stream, uint32_t* pCmdId)
{
	stream->has_error = false;

	*pCmdId = ReadPacked32(stream);
	uint32_t cmdSize = ReadPacked32(stream);
	if (stream->has_error)
		return (stream->pos != stream->end) ? SPLIT_WRONG_MSG_FORMAT : SPLIT_WAIT_FOR_MORE_DATA;

	if (cmdSize + 4 > stream->size)
		return SPLIT_CMD_TOO_LONG;

	if (GET_SIZE(stream) < cmdSize)
		return SPLIT_WAIT_FOR_MORE_DATA;

	stream->end = WRAP_IF_END(stream, stream->pos + cmdSize);
	return SPLIT_SUCCESS;
}


bool DispatchMessages(ProtoDescr* protoDescr)
{
// assert(!CALLED_FROM_INTERRUPT_HANDLER);
	CyclicBuffer* rxBuf = protoDescr->recvBuffer;
	// rxBuf->wpos; //this can be changed by interrupts at any moment, so read it to local var once
	MemStream stream = INIT_FROM_CBUF(rxBuf);
	size_t total_end = stream.end;

	while (GET_SIZE(&stream) >= 2)
	{
		stream.end = total_end;
		stream.has_error = false;
		size_t msg_start = stream.pos;
		uint32_t cmdId;
		int splitRes = protoDescr->Splitter(&stream, &cmdId);
		if (splitRes != SPLIT_SUCCESS) 
		{
			// TODO: log split res if != SPLIT_WAIT_FOR_MORE_DATA;
			if (splitRes != SPLIT_WAIT_FOR_MORE_DATA) 
			{
			//	rxBuf->rpos = rxBuf->wpos;// ?? do we need to clear buffer in case of error?
			}
			return splitRes == SPLIT_WAIT_FOR_MORE_DATA;
		}
		
		IdMapper mapper = protoDescr->RecvIdMapper;
		if (mapper != NULL)
			cmdId = mapper(cmdId);

		size_t message_end = stream.end;
		
//		size_t msg_size = (message_end < msg_start) ? stream.size + (message_end - msg_start) : message_end - msg_start;
//		printf("msgsize = %zd\n", msg_size);
		
    FILTER_RESULT filter_res = (NULL == protoDescr->Filter) ? PARSE_CMD : protoDescr->Filter(&stream, msg_start, cmdId);

    if (PAUSE_PARSING == filter_res)
      break;
   
    if (PARSE_CMD == filter_res)
		{
			const MessageDescr* descr = protoDescr->MsgDescriptorGetter(cmdId);
			char* data_ptr;
			if (descr != NULL)
			{
				ArenaAllocator* arena = protoDescr->arena;
				if (arena == NULL)
					return false;
				ArenaReset(arena);
				data_ptr = (char *)ArenaAllocateZ(arena, descr->size);
				if (data_ptr == NULL)
					return false; // not enough space in message buffer to unpack command

				protoDescr->Reader(&stream, data_ptr, descr, arena);

				if (ArenaHasErrors(arena) || stream.has_error)
					return false;
			}
			else
				data_ptr = NULL;

			protoDescr->DispatchMessage(cmdId, data_ptr);
		}
		
		stream.end = total_end;
		stream.pos = message_end;
		stream.has_error = false;
		rxBuf->rpos = message_end;
	}
	return true;
}


// default buffer for unpacked message
/*
#define UNPACKED_MESSAGE_MAX_SIZE 512
int g_DefMessageArenaBuf[UNPACKED_MESSAGE_MAX_SIZE / sizeof(int)]; //__attribute__((aligned(8)));

ArenaAllocator g_DefArena = ARENA_INIT(g_DefMessageArenaBuf);

ArenaAllocator* GetDefaultArena() {
	return &g_DefArena;
}
*/


///  Everything blow this line is depricated and will be removed in future versions

#if defined (_MSC_VER)
#define DEPRICATED(msg) __declspec(deprecated(msg))
#else
#define DEPRICATED(msg) __attribute__((deprecated))
#endif

ProtoDescr* g_def_proto = NULL;

inline ProtoDescr* GetDefaultProto()
{
	return g_def_proto;
}

void SetDefaultProto(ProtoDescr* proto)
{
	g_def_proto = proto;
}

DEPRICATED("use SendMessage") bool SendMessageOld(int messageId, const void* msg, const MessageDescr* descr)
{
	//assert(size == descr->size);

	if (msg != NULL)
		assert(descr != NULL);

	ProtoDescr* proto = GetDefaultProto();

	uint32_t flat_size = GetMessageDataSize(msg, descr);
	uint32_t buf_size = GetPackedSize32(messageId) + GetPackedSize32(flat_size) + flat_size;

	MemStream stream;
	stream.has_error = false;

	if (!CBufReserveAtomic(proto->sendBuffer, buf_size, &stream))
		return false;

	WritePacked32(&stream, messageId);
	WritePacked32(&stream, flat_size);

	if (flat_size > 0)
	{
		size_t param_pos = stream.pos;
		WriteMessage(&stream, msg, descr);

		assert(!stream.has_error);
		assert(stream.pos == stream.end);

		if (stream.has_error || stream.pos != stream.end) // TODO: deallocate buffer if possible
		{
			CBufClear(proto->sendBuffer);
			//			stream.pos = param_pos;
			//		stream.has_error = false;
			//	ZeroFill(&stream);
			return false;
		}
	}
	return true;
}

DEPRICATED("") bool GetDataToSend(void** data, size_t* size)
{
	ProtoDescr* proto = GetDefaultProto();
	if (proto == NULL)
		return false;
	return CBufGetDataForRead(proto->sendBuffer, data, size);
}

DEPRICATED("") bool MarkAsSent(size_t size)
{
	ProtoDescr* proto = GetDefaultProto();
	if (proto == NULL)
		return false;
	return CBufMarkAsRead(proto->sendBuffer, size);
}


DEPRICATED("") bool GetBufForReceive(void** data, size_t* size)
{
	ProtoDescr* proto = GetDefaultProto();
	if (proto == NULL)
		return false;
	return CBufGetBufForWrite(proto->recvBuffer, data, size);
}

DEPRICATED("") bool MarkAsReceived(size_t size)
{
	ProtoDescr* proto = GetDefaultProto();
	if (proto == NULL)
		return false;
	return CBufMarkAsWritten(proto->recvBuffer, size);
}


DEPRICATED("") size_t SendReceiveAvailableData(void)
{
	// Dummy version just for testing
	// it copies data from send to recv buffer
	// note, both buffers are circular buffers, so we should handle data warping correctly
	// it returns total bytes sent(copied) (final production version may return void)
	ProtoDescr* proto = GetDefaultProto();
	if (proto == NULL)
		return false;
	return CBufMoveAll(proto->recvBuffer, proto->sendBuffer);
}

DEPRICATED("") void ClearSendRecvBuffers(void)
{
	ProtoDescr* proto = GetDefaultProto();
	if (proto == NULL)
		return;
	CBufClear(proto->recvBuffer);
	CBufClear(proto->sendBuffer);
}

DEPRICATED("") bool DispatchReceivedMessages(void)
{
	ProtoDescr* proto = GetDefaultProto();
	if (proto == NULL)
		return false;
	return DispatchMessages(proto);
}

