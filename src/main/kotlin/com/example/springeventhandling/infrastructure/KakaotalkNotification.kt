package com.example.springeventhandling.infrastructure

import com.example.springeventhandling.domain.Notification
import com.example.springeventhandling.domain.event.OrderEvent
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionalEventListener

@Component
class KakaotalkNotification : Notification {

    @Order(1)
    @TransactionalEventListener(condition = "#orderEvent.kakaoNotification")
    override fun send(orderEvent: OrderEvent) {
        throw IllegalStateException("카카오톡 연동에 문제가 발생했습니다.")

//        val userName = orderEvent.getUserName()
//        val itemName = orderEvent.getItemName()
//        val itemPrice = orderEvent.getItemPrice()
//
//        print("${userName}에게 카카오톡을 전송합니다. - 주문 성공 (${itemName}, ${itemPrice}원)\n")
    }
}
