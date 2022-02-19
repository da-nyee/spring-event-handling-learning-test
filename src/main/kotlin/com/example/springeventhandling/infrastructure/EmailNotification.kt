package com.example.springeventhandling.infrastructure

import com.example.springeventhandling.domain.Notification
import com.example.springeventhandling.domain.event.OrderEvent
import org.springframework.context.event.EventListener
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
class EmailNotification : Notification {

    @Order(2)
    @EventListener
    override fun send(orderEvent: OrderEvent) {
        val userName = orderEvent.getUserName()
        val itemName = orderEvent.getItemName()
        val itemPrice = orderEvent.getItemPrice()

        print("${userName}에게 이메일을 전송합니다. - 주문 성공 (${itemName}, ${itemPrice}원)\n")
    }
}
