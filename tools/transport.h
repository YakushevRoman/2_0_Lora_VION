//****************************************************************************************************************************************************
//* Project: Protobuf compatible message protocol for STM32 (for FORPOST tagers)
//* Author: Alexander Lobas (alexanderlobas@yahoo.com)
//* File: transport.h - defines procedures to transfer data over communication channels
//*                    SendMessage - used from generated files to send message (all generated SendXXXXX procedures calls it). most likely you do not have to call it directly.
//*                                  it uses protolib.c to serialize message data into send buffer.  and exists after that. (it does not initiate data transfer).
//*                                  data dransfer should be initiated from SendReceiveAvailableData.
//*
//*                    interrupts: it is safe to call send message from interrupts, but message data (passed as parameter) must remain constant during SendMessage call
//*                                if message data could be changed any moment from interrups, make sure that message structures are defined as local variables and contains copy of such global data.
//*
//*
//*                    SendReceiveAvailableData() - must be called form main loop (not from interrupt) and must initialize data transfer if any data is available in send buffer.
//*                                                  (we need to implement logic here to send data over URART -> TCP)
//*
//*					   DispatchReceivedMessages() - must be called from main loop (just after SendReceiveAvailableData), it finds all fully received messages in recv buffer, 
//*                                                  dispatch them (calls OnMessaseXXXXReceived handler), and removes messages from recv buffer after that.
//*                                                  incompleted messages remain in buffer and wait for missing data parts
//*
//*                    all parts wrapped in MSVS define used for testing and debugging on Windows from Visual Studio, MSVS must be undefined when compiling for STM32
//****************************************************************************************************************************************************

#ifndef _TRANSPORT_H_INCLUDED
#define _TRANSPORT_H_INCLUDED

#include "protolib.h"
#include "cbuffer.h"

#if defined(__cplusplus) && !defined(ARDUINO)
#include <functional>
#endif

typedef struct _CommandDescr {
	uint32_t cmdId;
	const MessageDescr* msgDescr;
	uint32_t txtCmdId;
} CommandDescr;

#define DEFAULT_SEND_BUF_SIZE 512
#define DEFAULT_RECV_BUF_SIZE 512

#define DEFAULT_ARENA_SIZE 512

typedef enum 
{
  PARSE_CMD,
  JUMP_TO_NEXT,
  PAUSE_PARSING,
} FILTER_RESULT;

#if defined(__cplusplus) && !defined(ARDUINO)
typedef std::function <void(void)> EmptyReceiver;
typedef std::function <const MessageDescr*(uint32_t messageId)> MessageDescriptorGetter;
typedef std::function <void(uint32_t messageId, void* msg)> MessageDispatcher;
typedef std::function <int(MemStream* stream, uint32_t* pCmdId)> CommandSplitter;
typedef std::function <void(MemStream* stream, void* message_ptr, const MessageDescr* descr, ArenaAllocator* arena)> CommandReader;
typedef std::function <bool(MemStream* stream, const CommandDescr* cmd, const void* msg, uint32_t flat_size)> CommandWritter;
typedef std::function <uint32_t(uint32_t id)> IdMapper;
typedef std::function <bool(const void* data, size_t size)> DirectSendFunc;
typedef std::function <bool(CyclicBuffer* buf, const CommandDescr* cmd, MemStream* stream, uint32_t pack_size)> WriteAlloc;
typedef std::function <FILTER_RESULT(MemStream* stream, uint32_t start_pos, uint32_t messageId)> CommandFilter;
#else
typedef void(*EmptyReceiver)(void);
typedef const MessageDescr* (*MessageDescriptorGetter)(uint32_t messageId);
typedef void(*MessageDispatcher)(uint32_t messageId, void* msg);
typedef int(*CommandSplitter)(MemStream* stream, uint32_t* pCmdId);
typedef void(*CommandReader)(MemStream* stream, void* message_ptr, const MessageDescr* descr, ArenaAllocator* arena);
typedef bool(*CommandWritter)(MemStream* stream, const CommandDescr* cmd, const void* msg, uint32_t flat_size);
typedef uint32_t (*IdMapper)(uint32_t id);
typedef bool(*DirectSendFunc)(const void* data, size_t size);
typedef bool (*WriteAlloc)(CyclicBuffer* buf, const CommandDescr* cmd, MemStream* stream, uint32_t pack_size);
typedef FILTER_RESULT(*CommandFilter)(MemStream* stream, uint32_t start_pos, uint32_t messageId);
#endif

//uint32_t cmdId,
typedef struct _ProtoDescr{
	MessageDescriptorGetter MsgDescriptorGetter;
	CommandFilter Filter;
	MessageDispatcher DispatchMessage;
	CommandSplitter Splitter;
	CommandReader Reader;
	WriteAlloc     WriteAllocator;
	CommandWritter Writter;
	IdMapper  RecvIdMapper;
	DirectSendFunc DirectSend;
	CyclicBuffer* recvBuffer;
	CyclicBuffer* sendBuffer;
	ArenaAllocator* arena;
} ProtoDescr;

#ifdef __cplusplus
extern "C" {
#endif 

int BinCommandSplitter(MemStream* stream, uint32_t* pCmdId);
void BinCommandReader(MemStream* stream, void* message_ptr, const MessageDescr* descr, ArenaAllocator* arena);
bool DefaultWriteAllocator(CyclicBuffer* buf, const CommandDescr* cmd, MemStream* stream, uint32_t pack_size);
bool BinCommandWritter(MemStream* stream, const CommandDescr* cmd, const void* msg, uint32_t flat_size);

bool SendMessage(ProtoDescr* proto, const void* msg, const CommandDescr* cmdDescr);
bool DispatchMessages(ProtoDescr* protoDescr);


//  functions below this will be removed, please do not use them
void SetDefaultProto(ProtoDescr* proto);

bool SendMessageOld(int messageId, const void* msg, const MessageDescr* descr);
bool DispatchReceivedMessages(void);
size_t SendReceiveAvailableData(void);
bool GetDataToSend(void** data, size_t* size);
bool MarkAsSent(size_t size);

bool GetBufForReceive(void** data, size_t* size);
bool MarkAsReceived(size_t size);
void ClearSendRecvBuffers(void);

#ifdef __cplusplus
}
#endif 

#endif // _TRANSPORT_H_INCLUDED

