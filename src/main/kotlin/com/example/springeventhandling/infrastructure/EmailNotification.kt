package com.example.springeventhandling.infrastructure

import com.example.springeventhandling.domain.Notification
import com.example.springeventhandling.domain.Order
import org.springframework.stereotype.Component

@Component
class EmailNotification : Notification {

    override fun send(order: Order): String {
        val userName = order.getUserName()
        val itemName = order.getItemName()
        val itemPrice = order.getItemPrice()

        return "${userName}에게 이메일을 전송합니다. - 주문 성공 (${itemName}, ${itemPrice}원)"
    }
}
