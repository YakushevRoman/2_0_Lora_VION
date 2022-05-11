//****************************************************************************************************************************************************
//* Project: Protobuf compatible message serialization\deserialization for STM32 (for FORPOST tagers)
//* Author: Alexander Lobas (alexanderlobas@yahoo.com)
//* File: protolib.c - implements message serialziation\deserialization into circular buffer
//*                    this file should not contain any data transmission procedures, (they should be implemented in other files, for example transport.c)
//*                    can be used to implement message based protocols via any communication channels, like UART, IP(UDP\TCP) or others. 
//*                    limitations of current version: bufer size is harcoded (defined in header as STREAM_BUF_SIZE) and must be power of 2 (all buffers must have equal size)
//*                                                    does not support 64bit integers (alwasy skips them, if received data contains them)
//****************************************************************************************************************************************************


#include "protolib.h"

#if defined(_MSC_VER)
  #include <assert.h>
#else
  #define assert(X)
#endif
	/* for strcmp, strlen, memcpy, memmove, memset */

void SetString(string* str, const char* value)
{
	str->len = strlen(value);
	str->ptr = (char*)value;
}

uint32_t GetPackedSize32(uint32_t v)
{
	if (v < (1 << 7)) {
		return 1;
	}
	else if (v < (1 << 14)) {
		return 2;
	}
	else if (v < (1 << 21)) {
		return 3;
	}
	else if (v < (1 << 28)) {
		return 4;
	}
	else {
		return 5;
	}
}

uint32_t GetNumericFieldValue(void* data_ptr, int ctype) {
	switch ((ctype & (SIMPLE_TYPE_MASK | CTYPE_SIGNED))) {
		case CTYPE_BIN8:
			return *(uint8_t*)data_ptr;
		case CTYPE_BIN16:
			return *(uint16_t*)data_ptr;
		case CTYPE_BIN32:
		case (CTYPE_BIN32 | CTYPE_SIGNED):
			return *(uint32_t*)data_ptr;
		case (CTYPE_BIN8 | CTYPE_SIGNED):
			return (uint32_t)*(int8_t*)data_ptr; // fill high order bytes with sign bit
		case (CTYPE_BIN16 | CTYPE_SIGNED):
			return (uint32_t)*(int16_t*)data_ptr; // fill high order bytes with sign bit
		default:
			return 0;
	}
}

void SetNumericFieldValue(void* data_ptr, int ctype, uint32_t value) {
	switch ((ctype & (SIMPLE_TYPE_MASK))) {
	case CTYPE_BIN8:
		*(uint8_t*)data_ptr = value;
		break;
	case CTYPE_BIN16:
		*(uint16_t*)data_ptr = value;
		break;
	case CTYPE_BIN32:
		*(uint32_t*)data_ptr = value;
		break;
	}
}

inline uint32_t zigzagEncode(uint32_t value) {
	return (value << 1) ^ (((int32_t)value) >> 31);
}

inline int32_t zigzagDecode(uint32_t value) {
	return ((value >> 1) ^ (-(value & 1)));
}

uint32_t GetCTypeSize(const FieldDescr* field)
{
	switch (GET_SIMPLE_TYPE(field->ctype)) {
	case CTYPE_BIN8:
		return 1;
	case CTYPE_BIN16:
		return 2;
	case CTYPE_BIN32:
		return 4;
	case CTYPE_STRING:
		return sizeof(string);
	case CTYPE_MESSAGE:
		return (uint32_t)field->descr->size;
	}
	return 0;
}

uint32_t getFieldVarValue(void* data_ptr, int ctype)
{
	uint32_t value = GetNumericFieldValue(data_ptr, ctype);
	if (ctype & CTYPE_SIGNED)
		value = zigzagEncode(value);
	return value;
}

uint32_t getVarLenDataSize(void* data_ptr, const FieldDescr* field)
{
	assert(!IS_NUMERIC_TYPE(field->ctype));
	
	switch (GET_SIMPLE_TYPE(field->ctype))
	{
		case CTYPE_STRING:
			return (uint32_t)((string*)data_ptr)->len;
		case CTYPE_MESSAGE:
			return GetMessageDataSize(data_ptr,  field->descr);
		default:
			return 0;
	}
}

uint32_t getArrayItemsSize(array* array_ptr, const FieldDescr* field)
{
	if (array_ptr->count <= 0)
		return 0;

	uint32_t item_size = GetCTypeSize(field);

	char* data_ptr = array_ptr->ptr;

	uint32_t len = (uint32_t)array_ptr->count;

	switch (field->wiretype)
	{
	case WIRE_FIXED32:
		assert(IS_NUMERIC_TYPE(field->ctype));
		return 4 * len;
	case WIRE_FIXED64:
		assert(IS_NUMERIC_TYPE(field->ctype));
		return 8 * len;
	case WIRE_VAR:
	{
		assert(IS_NUMERIC_TYPE(field->ctype));
		uint32_t res = 0;
		for (uint32_t i = 0; i < len; ++i) {
			uint32_t value = getFieldVarValue(data_ptr, field->ctype);
			res += GetPackedSize32(value);
			data_ptr = (char*)data_ptr + item_size;
		}
		return res;
	}
	case WIRE_LEN: //string, bytes, messages (
	{

		switch (GET_SIMPLE_TYPE(field->ctype)) {
		case CTYPE_STRING:
		{
			uint32_t res = 0;
			string_array* sarray = (string_array*)array_ptr;
			for (uint32_t i = 0; i < len; ++i) {
				uint32_t value_size = (uint32_t)sarray->ptr[i].len;
				res += GetPackedSize32(value_size) + value_size;
			}
			return res;

		}
		case CTYPE_MESSAGE:
		{
			uint32_t res = 0;
			const MessageDescr* nested_msg = field->descr;
			for (uint32_t i = 0; i < len; ++i) {
				uint32_t msg_size = GetMessageDataSize(data_ptr, nested_msg);
				res += msg_size + GetPackedSize32(msg_size);
				data_ptr = (char*)data_ptr + item_size;
			}
			return res;
		}
		}
	}
	}
		
	//assert(false); // unsupported wire type
	return 0;
}

uint32_t getSingleFieldSize(void* data_ptr, const FieldDescr* field)
{
	//	if ((field->ctype & CTYPE_ARRAY) == 0) {
	switch (field->wiretype) {
	case WIRE_FIXED32:
	{

		//			if (!IS_NUMERIC_TYPE(field->ctype))
		//				return 0;
		uint32_t value = getFieldVarValue(data_ptr, field->ctype);
		return (value != 0) ? 4 : 0;
	}
	case WIRE_VAR:
	{
		//			if (!IS_NUMERIC_TYPE(field->ctype))
		//				return 0;
		uint32_t value = getFieldVarValue(data_ptr, field->ctype);
		return (value != 0) ? GetPackedSize32(value) : 0;
	}
	case WIRE_LEN: //string, bytes, messages
	{
		uint32_t size = getVarLenDataSize(data_ptr, field);
		return (size > 0) ? GetPackedSize32(size) + size : 0;
	}
	default:
		return 0;
	}
}

uint32_t GetMessageDataSize(const void* msg, const MessageDescr* descr)
{
	if (msg == NULL)
		return 0;	
	uint32_t res = 0;
	for (int i = 0; i < descr->field_count; ++i) 
	{
		const FieldDescr* field = descr->fields + i;
		void* data_ptr = (char*)msg + field->offset;


		if ((field->ctype & CTYPE_ARRAY) == 0) {
			uint32_t fsize = getSingleFieldSize(data_ptr, field);
			if (fsize > 0) {
				res += fsize;
				uint32_t tag_size = GetPackedSize32(field->id << 3);
				res += tag_size;
			}
		}
		else
		{
			uint32_t internal_size = getArrayItemsSize((array*)data_ptr, field);
			if (internal_size > 0)
			{
				res += internal_size;
				uint32_t tag_size = GetPackedSize32(field->id << 3);
				if (field->wiretype == WIRE_LEN)
					res += tag_size * (((array*)data_ptr)->count);
				else
					res += tag_size + GetPackedSize32(internal_size);
			}
		}
	}
	return res;
}

bool MSCompareBin(MemStream* stream, const char* data, size_t size)
{
	if (GET_SIZE(stream) != size)
		return false;
	size_t pos = stream->pos;
	if (stream->end < pos)
	{
		size_t block = stream->size - pos;
		int res = memcmp(stream->bufptr + pos, data, block);
		if (res != 0)
			return false;
		size -= block;
		data += block;
		pos = 0;
	}
	return memcmp(stream->bufptr + pos, data, size) == 0;
}

bool MSCompareTxt(MemStream* stream, const char* data)
{
	return MSCompareBin(stream, data, strlen(data));
}

size_t PushLimit(MemStream* stream, size_t size)
{
	size_t res = stream->end;
	if (GET_SIZE(stream) >= size) {
		stream->end = WRAP_IF_END(stream, stream->pos + size);
	}
	else
		stream->has_error = true;
	return res;
}

void PopLimit(MemStream* stream, size_t limit)
{
	stream->end = limit;
}

bool IsFull(MemStream* stream) {
	return (stream->end + 1 == stream->pos) || (stream->pos == 0 && stream->end + 1 == stream->size);
}

bool IsEmpty(MemStream* stream) {
	return (stream->pos == stream->end);
}

void WriteByte(MemStream* stream, uint8_t val)
{
	if (stream->end != stream->pos) {
		stream->bufptr[stream->pos] = val;
		INC_POS(stream);
	}
	else
		stream->has_error = true;
}

uint8_t ReadByte(MemStream* stream)
{
	if (stream->end != stream->pos) {
		uint8_t res = (uint8_t)stream->bufptr[stream->pos];
		INC_POS(stream);
		return res;
	}
	else
	{
		stream->has_error = true;
		return 0;
	}
}

void WriteFixed32(MemStream* stream, uint32_t val)
{
	if (GET_SIZE(stream) >= 4) {
		if (HAS_CONTINUOUS_SPACE(stream, 4) && (stream->pos & 3) == 0) {
			*(uint32_t*)GET_PTR(stream) = val;
			stream->pos = WRAP_IF_END(stream, stream->pos + 4);
		}
		else
		{
			WriteByte(stream, val);
			WriteByte(stream, val >> 8);
			WriteByte(stream, val >> 16);
			WriteByte(stream, val >> 24);
		}
	}
	else
		stream->has_error = true;
}

uint32_t ReadFixed32(MemStream* stream)
{
	if (GET_SIZE(stream) >= 4) {
		if (HAS_CONTINUOUS_SPACE(stream, 4) && ((stream->pos & 3) == 0)) {
			uint32_t res = *(uint32_t*)GET_PTR(stream);
			stream->pos = WRAP_IF_END(stream, stream->pos + 4);
			return res;
		}
		else
		{
			return ReadByte(stream) | (ReadByte(stream) << 8) | (ReadByte(stream) << 16) | (ReadByte(stream) << 24);
		}
	}
	else
	{
		stream->has_error = true;
		return 0;
	}
}

char* WritePacked32Flat(char *ptr, uint32_t val)
{
	if (val >= 0x80) {
		*(ptr++) = val | 0x80;
		val >>= 7;
		if (val >= 0x80) {
			*(ptr++) = val | 0x80;
			val >>= 7;
			if (val >= 0x80) {
				*(ptr++) = val | 0x80;
				val >>= 7;
				if (val >= 0x80) {
					*(ptr++) = val | 0x80;
					val >>= 7;
				}
			}
		}
	}
	assert((val & 0x80) == 0);
	*(ptr++) = val;
	return ptr;
}

void WritePacked32(MemStream* stream, uint32_t val)
{
	if (stream->has_error)
		return;
	size_t bytesLeft = GET_SIZE(stream);
	if (bytesLeft >= 5 && HAS_CONTINUOUS_SPACE(stream, 5)) 
	{  // call faster function, that does not handle ring buf 
		size_t npos = WritePacked32Flat(GET_PTR(stream), val) - stream->bufptr;
    stream->pos = WRAP_IF_END(stream, npos);
		return;
	}
	if (val >= 0x80) {
		WriteByte(stream, val | 0x80);
		val >>= 7;
		if (val >= 0x80) {
			WriteByte(stream, val | 0x80);
			val >>= 7;
			if (val >= 0x80) {
				WriteByte(stream, val | 0x80);
				val >>= 7;
				if (val >= 0x80) {
					WriteByte(stream, val | 0x80);
					val >>= 7;
				}
			}
		}
	}
	WriteByte(stream, val);
}

uint32_t ReadPacked32(MemStream* stream)
{
	if (stream->has_error)
		return 0;

	uint32_t res = ReadByte(stream);
	if (res & (1 << 7)) {
		res = (res & ((1 << 7)-  1)) | (ReadByte(stream) << 7);
		if (res & (1 << 14)) {
			res = (res & ((1 << 14) - 1)) | (ReadByte(stream) << 14);
			if (res & (1 << 21)) {
				res = (res & ((1 << 21) - 1)) | (ReadByte(stream) << 21);
				if (res & (1 << 28)) {
					uint8_t b = ReadByte(stream);
					res = (res & ((1 << 28) - 1)) | (b << 28);
					int c = 5;
					while (((b & 0x80) != 0) && c-- > 0)
						b = ReadByte(stream);
					if ((b & 0x80) != 0)
						stream->has_error = true;
				}
			}
		}
	}
	return res;	
}

void ZeroFill(MemStream* stream)
{
	if (stream->pos < stream->end)
		memset(stream->bufptr + stream->pos, 0, stream->end - stream->pos);
	else if (stream->pos > stream->end)
	{
		memset(stream->bufptr + stream->pos, 0, stream->size - stream->pos);
		memset(stream->bufptr, 0, stream->end);
	}
}

void WriteBuf(MemStream* stream, void* buf, size_t size)
{
	if (stream->has_error)
		return;
	if (GET_SIZE(stream) >= size) {
		if (HAS_CONTINUOUS_SPACE(stream, size)) {
			memcpy(GET_PTR(stream), buf, size);
			stream->pos = WRAP_IF_END(stream, stream->pos + size);
		}
		else
		{
			size_t first_block = stream->size - stream->pos;
			memcpy(GET_PTR(stream), buf, first_block);
			size_t second_block = size - first_block;
			memcpy(stream->bufptr, (char*)buf + first_block, second_block);
			stream->pos = second_block;
		}
	}
	else
		stream->has_error = true;
}

bool ReadBuf(MemStream* stream, void* buf, size_t size)
{
	if (stream->has_error)
		return false;
	if (GET_SIZE(stream) >= size) {
		if (HAS_CONTINUOUS_SPACE(stream, size)) {
			memcpy(buf, GET_PTR(stream), size);
			stream->pos = WRAP_IF_END(stream, stream->pos + size);
		}
		else
		{
			size_t first_block = stream->size - stream->pos;
			memcpy(buf, GET_PTR(stream), first_block);
			size_t second_block = size - first_block;
			memcpy((char*)buf + first_block, stream->bufptr, second_block);
			stream->pos = second_block;
		}
	}
	else
		stream->has_error = true;
	return !stream->has_error;
}

void WriteString(MemStream* stream, string* str)
{
	WritePacked32(stream, (uint32_t)str->len);
	WriteBuf(stream, str->ptr, (uint32_t)str->len);
}

char protoEmptyString = 0;

bool ReadString(MemStream* stream, string* str, ArenaAllocator* arena, bool add_zero)
{
	uint32_t len = ReadPacked32(stream);
	if (len == 0)
	{
		str->len = 0;
		str->ptr = (add_zero)? &protoEmptyString: NULL;
	}
	if (GET_SIZE(stream) >= len) {
		if (!add_zero && HAS_CONTINUOUS_SPACE(stream, len)) {
			str->len = len;
			str->ptr = GET_PTR(stream);
			stream->pos = WRAP_IF_END(stream, stream->pos + len);
		}
		else
		{
			str->len = len;
			str->ptr = (char*)ArenaAllocate(arena, (add_zero)?len + 1: len);
			if (str->ptr != NULL) {
				ReadBuf(stream, str->ptr, len);
				if (add_zero)
					str->ptr[len] = 0;
			}
			else
				str->len = 0;
		}
	}
	else
		stream->has_error = true;
	return !stream->has_error;
}

void WriteArrayField(MemStream* stream, array* array_ptr, const FieldDescr* field)
{
	if (array_ptr->count <= 0 || stream->has_error)
		return;

	uint32_t fullid = (field->id << 3) | WIRE_LEN;

	int count = array_ptr->count;

	if (field->wiretype == WIRE_LEN) 
	{
		switch (GET_SIMPLE_TYPE(field->ctype)) {
		case CTYPE_STRING:
		{
			string* data_ptr = array_ptr->ptr;
			for (int i = 0; i < count; ++i)
			{
				WritePacked32(stream, fullid);
				WriteString(stream, data_ptr + i);
			}
			break;
		}
		case CTYPE_MESSAGE:
		{
			size_t item_size = field->descr->size;
			char* data_ptr = array_ptr->ptr;
			for (int i = 0; i < count; ++i)
			{
				WritePacked32(stream, fullid);
				uint32_t msg_size = GetMessageDataSize(data_ptr, field->descr);
				WritePacked32(stream, msg_size);
				WriteMessage(stream, data_ptr, field->descr);
				data_ptr += item_size;
			}
			break;
		}
		}
	}
	else
	{
		uint32_t item_size = GetCTypeSize(field);
		WritePacked32(stream, fullid);
		uint32_t flat_size = getArrayItemsSize(array_ptr, field);
		WritePacked32(stream, flat_size);
#ifdef _DEBUG
		size_t size_before_write = GET_SIZE(stream);
#endif // _DEBUG
		switch (field->wiretype) {
		case WIRE_FIXED32:
		{
			char* data_ptr = array_ptr->ptr;
			for (int i = 0; i < count; ++i)
			{
				WriteFixed32(stream, GetNumericFieldValue(data_ptr, field->ctype));
				data_ptr += item_size;
			}
			break;
		}
		case WIRE_VAR:
		{
			char* data_ptr = array_ptr->ptr;
			for (int i = 0; i < count; ++i)
			{
				WritePacked32(stream, getFieldVarValue(data_ptr, field->ctype));
				data_ptr += item_size;
			}
			break;
		}
		}

#ifdef _DEBUG
		assert(stream->has_error || size_before_write == GET_SIZE(stream) + flat_size);
#endif // DEBUG
	}

}

uint32_t CountVARFlat(const char* buf, size_t size)
{
	const char* end = buf + size;
	uint32_t res = 0;
	while (buf != end) {
		if ((*(buf++) & 0x80) == 0)
			res++;
	}
	return res;
}

uint32_t CountVAR(MemStream* stream, size_t size)
{
	if (HAS_CONTINUOUS_SPACE(stream, size))
		return CountVARFlat(GET_PTR(stream), size);
	else {
		size_t first_chunk = stream->size - stream->pos;
		return CountVARFlat(GET_PTR(stream), first_chunk) + CountVARFlat(stream->bufptr, size - first_chunk);
	}
}

void ReadPackedArrayField(MemStream* stream, array* array_ptr, const FieldDescr* field, ArenaAllocator* arena)
{
	assert(field->wiretype != WIRE_LEN); // string, bytes and messages are not packable

	uint32_t packed_size = ReadPacked32(stream);
	if (packed_size == 0)
	{
		array_ptr->count = 0;
		array_ptr->ptr = 0;
		return;
	}
	size_t limit = PushLimit(stream, packed_size);

	if (stream->has_error)
		return;

	size_t item_size = GetCTypeSize(field);
	switch (field->wiretype) {
	case WIRE_FIXED32:
	{
		if ((packed_size & 3) != 0) {
			stream->has_error = true;
			break;
		}
		size_t count = packed_size >> 2;
		char* data_ptr = ArenaAllocate(arena, count * item_size);
		if (data_ptr == NULL)
			break;
		array_ptr->count = (int)count;
		array_ptr->ptr = data_ptr;
		for (size_t i = 0; i < count; ++i)
		{
			SetNumericFieldValue(data_ptr, field->ctype, ReadFixed32(stream));
			data_ptr += item_size;
		}
		break;
	}
	case WIRE_VAR:
	{
		uint32_t count = CountVAR(stream, packed_size);
		char* data_ptr = ArenaAllocate(arena, count * item_size);
		if (data_ptr == NULL)
			break;
		array_ptr->count = count;
		array_ptr->ptr = data_ptr;
		for (size_t i = 0; i < count; ++i)
		{
			SetNumericFieldValue(data_ptr, field->ctype, ReadPacked32(stream));
			data_ptr += item_size;
		}
		break;
	}
	}

	if (stream->pos != stream->end)
		stream->has_error = true; // fail whole message because of incorrect field

/*	if (stream->pos != stream->end || stream->has_error)
	{
		array_ptr->count = 0;
		array_ptr->ptr = NULL;
		stream->has_error = false; // just skip incorrect field
	}*/
	PopLimit(stream, limit);
}


void WriteMessage(MemStream* stream, const void* message_ptr, const MessageDescr* descr) 
{
	for (int i = 0; i < descr->field_count; ++i)
	{
		if (stream->has_error)
			return;
		const FieldDescr* field = descr->fields + i;
		void* data_ptr = (char*)message_ptr + field->offset;
		if ((field->ctype & CTYPE_ARRAY) != 0) {
			WriteArrayField(stream, (array*)data_ptr, field);
			continue;
		}
		uint32_t fullid = (field->id << 3) | field->wiretype;
		switch (field->wiretype) {
			case WIRE_FIXED32:
			{
				uint32_t val = GetNumericFieldValue(data_ptr, field->ctype);
				if (val != 0) {
					WritePacked32(stream, fullid);
					WriteFixed32(stream, val);
				}
				break;

			}
			case WIRE_VAR:
			{
				uint32_t val = getFieldVarValue(data_ptr, field->ctype);
				if (val != 0) {
					WritePacked32(stream, fullid);
					WritePacked32(stream, val);
				}
				break;
			}
			case WIRE_LEN:
			{
				switch (GET_SIMPLE_TYPE(field->ctype)) {
					case CTYPE_STRING:
						if (((string*)data_ptr)->len > 0)
						{
							WritePacked32(stream, fullid);
							WriteString(stream, (string*)data_ptr);
						}
						break;
					case CTYPE_MESSAGE:
					{
						uint32_t flat_size = GetMessageDataSize(data_ptr, field->descr);
						if (flat_size > 0) {
							WritePacked32(stream, fullid);
							WritePacked32(stream, flat_size);
							size_t size_before_write = GET_SIZE(stream);
							WriteMessage(stream, data_ptr, field->descr);

							assert(!stream->has_error && size_before_write == GET_SIZE(stream) + flat_size);
						}
					}
				}
			}
		}
	}
}


const FieldDescr* GetFiledDescr(int id, const MessageDescr* descr)
{
	size_t a = 0;
	size_t b = descr->field_count;
	while (a < b) {
		size_t c = (a + b) >> 1;
		if (descr->fields[c].id < id)
			a = c + 1;
		else
			b = c;
	}
	if (a < descr->field_count && descr->fields[a].id == id)
		return descr->fields + a;
	else
		return NULL;
}

void SkipField(MemStream* stream, uint8_t wire_type)
{
	size_t skip_size;
	switch (wire_type)
	{
	case WIRE_FIXED64:
		skip_size = 8;
		break;
	case WIRE_FIXED32:
		skip_size = 4;
		break;
	case WIRE_VAR:
		ReadPacked32(stream);
		return;
	case WIRE_LEN:
		skip_size = ReadPacked32(stream);
		break;
	default:
		return;
	}
	if (GET_SIZE(stream) >= skip_size)
		stream->pos = WRAP_IF_END(stream, stream->pos + skip_size);
	else
		stream->has_error = true;

}

bool IsCompatibleWireType(const FieldDescr* field, uint8_t net_wire) {
	// if you change anything here, please update ReadMessage accordingly
	if (field->ctype & CTYPE_ARRAY)
		return net_wire == WIRE_LEN;
	else
		return net_wire == field->wiretype || (net_wire == WIRE_FIXED32 && field->wiretype == WIRE_VAR) || (net_wire == WIRE_VAR && field->wiretype == WIRE_FIXED32);
}

uint32_t countRepFieldByTagWithWire(MemStream* stream, uint32_t tagAndWire)
{
	uint32_t res = 0;
	while (!stream->has_error && stream->pos != stream->end)
	{
		uint32_t fieldTagAndWire = ReadPacked32(stream);
		if (tagAndWire == fieldTagAndWire)
			res++;
		SkipField(stream, fieldTagAndWire & 0x7);
	}
	return res;
}

void ReadMessageWithLenPrefix(MemStream* stream, void* message_ptr, const MessageDescr* descr, ArenaAllocator* arena)
{
	uint32_t msgLen = ReadPacked32(stream);
	size_t limit = PushLimit(stream, msgLen);
	if (stream->has_error)
		return;
	ReadMessage(stream, message_ptr, descr, arena);
	if (stream->pos != stream->end) 
		stream->has_error = true;
	PopLimit(stream, limit);
}

void ReadMessage(MemStream* stream, void* message_ptr, const MessageDescr* descr, ArenaAllocator* arena)
{
	while (!stream->has_error && stream->pos != stream->end) 
	{
		uint32_t fullid = ReadPacked32(stream);
		uint32_t id = fullid >> 3;
		uint32_t wire_type = fullid & 0x7;
		const FieldDescr* field = GetFiledDescr(id, descr);
		if (field == NULL || !IsCompatibleWireType(field, wire_type)) {
			SkipField(stream, wire_type);
			continue;
		}

		void* data_ptr = (char*)message_ptr + field->offset;
		if (field->ctype & CTYPE_ARRAY) 
		{
			assert(wire_type == WIRE_LEN); // check logic of IsCompatibleWireType if assertion fails
			array* array_ptr = (array*)data_ptr;
			if (field->wiretype == WIRE_LEN)
			{
				if (array_ptr->ptr == NULL) 
				{
					size_t pos = stream->pos;
					SkipField(stream, WIRE_LEN);
					uint32_t itemCount = 1 + countRepFieldByTagWithWire(stream, fullid);
					stream->pos = pos;
					if (stream->has_error)
						break;
					size_t item_size = GetCTypeSize(field);
					char* pValues = ArenaAllocateZ(arena, itemCount * item_size);
					if (pValues == NULL)
						return;
					array_ptr->ptr = pValues;
					array_ptr->count = 0;
				}
				switch (GET_SIMPLE_TYPE(field->ctype)) {
				case CTYPE_STRING:

					ReadString(stream, ((string*)(array_ptr->ptr)) + array_ptr->count, arena, true);
					array_ptr->count++;
					break;
				case CTYPE_MESSAGE:
					ReadMessageWithLenPrefix(stream, (char*)(array_ptr->ptr) + array_ptr->count * field->descr->size, field->descr, arena);
					array_ptr->count++;
					break;
				}
			}
			else
				ReadPackedArrayField(stream, array_ptr, field, arena);
		}
		else 
		{
			switch (wire_type)
			{
			case WIRE_FIXED32:
				assert(IS_NUMERIC_TYPE(field->ctype)); // check logic of IsCompatibleWireType if this assertion fails
				SetNumericFieldValue(data_ptr, field->ctype, ReadFixed32(stream));
				break;
			case WIRE_VAR:
				assert(IS_NUMERIC_TYPE(field->ctype));// check logic of IsCompatibleWireType if this assertion fails
				SetNumericFieldValue(data_ptr, field->ctype, ReadPacked32(stream));
				break;
			case WIRE_LEN:
				switch (GET_SIMPLE_TYPE(field->ctype)) {
				case CTYPE_STRING:
					ReadString(stream, data_ptr, arena, true);
					break;
				case CTYPE_MESSAGE:
					ReadMessageWithLenPrefix(stream, data_ptr, field->descr, arena);
					break;
				}
			default:
				break;
			}
		}
	}
}


void WriteLenPrefixedMessage(MemStream* stream, const void* message_ptr, const MessageDescr* descr)
{
	uint32_t size = GetMessageDataSize(message_ptr, descr);
	WritePacked32(stream, size);
	WriteMessage(stream, message_ptr, descr);
}

void* ReadLenPrefixedMessage(MemStream* stream, ArenaAllocator* arena, const MessageDescr* descr)
{
	uint32_t size = ReadPacked32(stream);
	if (stream->has_error || GET_SIZE(stream) < size)
		return NULL;
	void* msg_ptr = ArenaAllocateZ(arena, descr->size);
	if (msg_ptr == NULL)
		return NULL;
	size_t prev = PushLimit(stream, size);
	ReadMessage(stream, msg_ptr, descr, arena);
	PopLimit(stream, prev);
	return (!stream->has_error) ? msg_ptr : NULL;
}

// Arena API

void ArenaInit(ArenaAllocator* arena, char* buffer, size_t size)
{
	arena->buf_start = buffer;
	arena->buf_end = buffer + size;
	arena->top_ptr = buffer;
}

void ArenaReset(ArenaAllocator* arena) 
{
	arena->top_ptr = arena->buf_start;
}

void* ArenaAllocate(ArenaAllocator* arena, size_t size) 
{
	char* res = (char*)(((uintptr_t)arena->top_ptr + 3) & ~3);
	char* newTop = res + size;
	if (newTop <= arena->buf_end && newTop >= res) {
		void* res = arena->top_ptr;
		arena->top_ptr = newTop;
		return res;
	}
	arena->top_ptr = NULL;
	return NULL;
}

void* ArenaAllocateZ(ArenaAllocator* arena, size_t size) {
	void* res = ArenaAllocate(arena, size);
	if (res != NULL)
		memset(res, 0, size);
	return res;
}

// returns true if at least one allocation failed since last reset.
bool ArenaHasErrors(ArenaAllocator* arena)
{
	return arena->top_ptr == NULL;
}

