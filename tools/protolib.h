//****************************************************************************************************************************************************
//* Project: Protobuf compatible message serialization\deserialization for STM32 (for FORPOST tagers)
//* Author: Alexander Lobas (alexanderlobas@yahoo.com)
//* File: protolib.h - defines base types to be used in generated files 
//*                    MemStream and related macros are structures to simplify work with cirular(ring) buffers
//*                    WIRE_XXXX constants define protobuf compatible wire types (their values must match corresponding values in original google protobuf library) 
//*                    string structue is used to represent string and array of bytes (set_string helper function can be used to initialize it).
//*                    array - represends array of any type (corresponds to proto fields marked as "repeated"). code that initialize array must chose correct (compatible) data type for items and cast array.ptr to that type,
//*                            array.count is a number of all items in array (not a size of all items).
//*
//*                    interrupts: if data could be changed any moment from interrups, make sure that message structures are defined as local variables and contains copy of such global data 
//*                                data must remain constant during WriteMessage call.
//*                                serializatoin is performed in two passes, first pass calculates flat structure data size, reserves space in buffers and second fills data into buffers.
//*                                if serializaed data are changed between passes - it may not fit into reserved space and serialization fails.
//*                    it is recomented to use generated message structres for communication only (do not use them in other parts like program state storage).
//****************************************************************************************************************************************************

#ifndef _FORPOST_PROTO_LIB
#define _FORPOST_PROTO_LIB

#include <stddef.h>
#include <stdint.h>
#include <stdbool.h>

#define FLD_OFFSET(Type, Field) offsetof(Type, Field)

//((int)(&(((Type*)(0))->Field)))

#define WIRE_VAR 0
#define WIRE_FIXED64 1
#define WIRE_LEN 2
#define WIRE_FIXED32 5

// set if filed is outside
#define CTYPE_REF       0x08   

// used only for array of strings, bytes  (temporary not used - in array of string items always refs)
//#define CTYPE_ITEM_REF  0x10   

// set for repeated
#define CTYPE_ARRAY     0x20   

// set for signed var
#define CTYPE_SIGNED    0x40   

// simple types
#define CTYPE_BIN8     0x00
#define CTYPE_BIN16    0x01
#define CTYPE_BIN32    0x02
#define CTYPE_STRING   0x03
//#define CTYPE_BYTES    0x04
#define CTYPE_MESSAGE  0x05

#define SIMPLE_TYPE_MASK  0x07
#define GET_SIMPLE_TYPE(val) (val & 0x07)
#define IS_NUMERIC_TYPE(val) ((val & 0x07) < 3)

#include <string.h> 
#define PROTO_TXT

typedef struct _MessageDescr MessageDescr;

typedef struct _FieldDescr {
	uint8_t id;
	uint8_t wiretype;
	uint8_t ctype;
	uint8_t offset;
	//uint8 size;
	const MessageDescr* descr;
#ifdef PROTO_TXT
	uint32_t txtId;
#endif // PROTO_TXT
} FieldDescr;

struct _MessageDescr {
	size_t size;
	int field_count;
	const FieldDescr* fields;
	uint32_t binSendCmdId;
#ifdef PROTO_TXT
	uint32_t txtSendCmdId;
#endif // PROTO_TXT
};

typedef struct _string {
	size_t len;
	char* ptr;
} string;

typedef struct _array {
	int count;
	void* ptr;
} array;

typedef struct _string_array {
	int count;
	string* ptr;
} string_array;

typedef struct int32_array {
	int count;
	int32_t* ptr;
} int32_array;

typedef struct uint32_array {
	int count;
	uint32_t* ptr;
} uint32_array;

// cyclic stream
// must be power of 2 (to simplify code)
/*
#define STREAM_BUF_SIZE 512

#if (BUFFER_SIZE & (BUFFER_SIZE - 1)) != 0
	#error "STREAM_BUF_SIZE must be power of 2"
#endif

#define STREAM_BUF_SIZE_MASK (STREAM_BUF_SIZE - 1)
*/

//#define REQUIRE_POW_2_SIZE 

typedef void* (*allocator)(size_t size);

typedef struct _MemStream {
	char* bufptr;
	size_t pos;
	size_t end;
	size_t size; // buffer size
	bool has_error;
} MemStream;


#define MSTREAM_INIT(buf) {(char*)buf, 0, 0, sizeof(buf), false}
#define INIT_FROM_CBUF(cbuf) {(cbuf)->data, (cbuf)->rpos, (cbuf)->wpos, (cbuf)->size, false}

#ifdef REQUIRE_POW_2_SIZE

#define GET_SIZE(pstream)  (((pstream)->end - (pstream)->pos) & (pstream)->size - 1)
//#define CALC_POS(pos, delta) ((pos + delta) & STREAM_BUF_SIZE_MASK)
//#define GET_POS(pstream, delta) (((pstream)->pos + delta) & (pstream)->size - 1)

//#define INC_POS_BY_UNSAFE(pstream, delta)   if (((pstream)->pos += delta) == (pstream)->size) (pstream)->pos = 0
#define WRAP_IF_END(pstream, pos)  ((pos) & ((pstream)->size - 1))
//#define WRAP_IF_OVERFLOW_NEG(pstream, pos)  ((pos) & ((pstream)->size - 1))

//#define INC_POS_BY_UNSAFE(pstream, delta)   ((pstream)->pos = ((pstream)->pos + delta) & ((pstream)->size - 1))
//#define INC_POS_BY(pstream, delta)   ((pstream)->pos = ((pstream)->pos + delta) & ((pstream)->size - 1))

#else 

#define GET_SIZE(pstream) (((pstream)->end < (pstream)->pos) ? (pstream)->size + (pstream)->end - (pstream)->pos : (pstream)->end - (pstream)->pos)

#define GET_CONTINUOUS_SIZE(pstream) (((pstream)->end < (pstream)->pos) ? (pstream)->size - (pstream)->pos : (pstream)->end - (pstream)->pos)

#define WRAP_IF_END(pstream, pos) (((pos) < (pstream)->size) ? (pos) : (pos) - (pstream)->size)

#define INC_POS_BY(pstream, delta) ((pstream)->pos = WRAP_IF_END(pstream, (pstream)->pos + (delta)))

#endif 

#define INC_POS(pstream) INC_POS_BY((pstream), 1)

#define GET_PTR(pstream)  ((pstream)->bufptr + (pstream)->pos)

#define HAS_CONTINUOUS_SPACE(pstream, space) (GET_CONTINUOUS_SIZE(pstream) >= (space))

// simple implementation of ArenaAlocator https://developers.google.com/protocol-buffers/docs/reference/arenas
typedef struct _ArenaAllocator {
	char* buf_start;
	char* buf_end;
	char* top_ptr;
} ArenaAllocator;

#define ARENA_INIT(buf) {(char*)buf, ((char*)buf) + sizeof(buf), (char*)buf}

#ifdef __cplusplus
extern "C" {
#endif 

void ArenaInit(ArenaAllocator* arena, char* buffer, size_t size); 
void ArenaReset(ArenaAllocator* arena); // clears all allocated blocks and errors
void* ArenaAllocate(ArenaAllocator* arena, size_t size); // allocates block in arena, returns null if fails
void* ArenaAllocateZ(ArenaAllocator* arena, size_t size); // same as ArenaAllocate, but fills allocated buffer with zero's 
bool ArenaHasErrors(ArenaAllocator* arena); // returns true if at least one allocation failed since last reset.

bool IsFull(MemStream* stream);
bool IsEmpty(MemStream* stream);

bool MSCompareBin(MemStream* stream, const char* data, size_t size);
bool MSCompareTxt(MemStream* stream, const char* data);

void WriteMessage(MemStream* stream, const void* message_ptr, const MessageDescr* descr);
void ReadMessage(MemStream* stream, void* message_ptr, const MessageDescr* descr, ArenaAllocator* arena);

void WriteLenPrefixedMessage(MemStream* stream, const void* message_ptr, const MessageDescr* descr);
void* ReadLenPrefixedMessage(MemStream* stream, ArenaAllocator* arena, const MessageDescr* descr);

uint32_t GetPackedSize32(uint32_t v);
void WritePacked32(MemStream* stream, uint32_t val);
uint32_t ReadPacked32(MemStream* stream);

void ZeroFill(MemStream* stream);
void WriteByte(MemStream* stream, uint8_t val);
uint8_t ReadByte(MemStream* stream);

void WriteBuf(MemStream* stream, void* buf, size_t size);
bool ReadBuf(MemStream* stream, void* buf, size_t size);

void SetString(string* str, const char* value);

uint32_t GetMessageDataSize(const void* msg, const MessageDescr* descr);

// this is needed for text writter
void SetNumericFieldValue(void* data_ptr, int ctype, uint32_t value);
uint32_t GetNumericFieldValue(void* data_ptr, int ctype);
uint32_t GetCTypeSize(const FieldDescr* field);

static inline void FillStream(void* _stream, char* _data, size_t _pos, size_t _end, size_t _size, bool _has_error) {
		MemStream* stream = (MemStream*) _stream;
		
		stream->bufptr = _data;
		stream->pos = _pos;
		stream->end = _end;
		stream->size = _size;
		stream->has_error = _has_error;
}

#ifdef __cplusplus
}
#endif 

// this return codes of CommandSplitter (probably will be moved later to separate file)
#define SPLIT_SUCCESS 0
#define SPLIT_WAIT_FOR_MORE_DATA 1
#define SPLIT_CMD_TOO_LONG 2
#define SPLIT_WRONG_MSG_FORMAT 3

#endif // !_FORPOST_PROTO_LIB


