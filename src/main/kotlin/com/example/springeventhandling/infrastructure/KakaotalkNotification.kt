package com.example.springeventhandling.infrastructure

import com.example.springeventhandling.domain.Notification
import com.example.springeventhandling.domain.event.OrderEvent
import org.springframework.context.event.EventListener
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
class KakaotalkNotification : Notification {

    @Order(1)
    @EventListener(condition = "#orderEvent.kakaoNotification")
    override fun send(orderEvent: OrderEvent) {
        val userName = orderEvent.getUserName()
        val itemName = orderEvent.getItemName()
        val itemPrice = orderEvent.getItemPrice()

        print("${userName}에게 카카오톡을 전송합니다. - 주문 성공 (${itemName}, ${itemPrice}원)\n")
    }
}
