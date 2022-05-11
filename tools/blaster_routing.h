#ifndef BLASTER_ROUTING_H
#define BLASTER_ROUTING_H
#include "stdbool.h"

enum{ROUTING_SERV_VEST_S = 3000, ROUTING_SERV_VEST_E = 3200};

inline static bool Routing_ItProtoVestSrv(unsigned int _messageId){
	return (_messageId >= ROUTING_SERV_VEST_S && _messageId < ROUTING_SERV_VEST_E);
}


#endif
