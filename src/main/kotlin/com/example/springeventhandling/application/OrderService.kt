package com.example.springeventhandling.application

import com.example.springeventhandling.application.dto.OrderRequestDto
import com.example.springeventhandling.domain.Item
import com.example.springeventhandling.domain.Order
import com.example.springeventhandling.domain.User
import com.example.springeventhandling.domain.event.OrderEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Service
class OrderService(
    private val eventPublisher: ApplicationEventPublisher
) {

    @Transactional
    fun order(requestDto: OrderRequestDto) {
        val orderId = requestDto.orderId
        val user = getUser(requestDto.userId, requestDto.userName)
        val item = getItem(requestDto.itemId, requestDto.itemName, requestDto.itemPrice)

        val order = makeOrder(orderId, user, item)

        if (order.isFail()) {
            throw IllegalStateException("주문 실패")
        }

        eventPublisher.publishEvent(OrderEvent(order, emailNotification = true, kakaotalkNotification = true))

        print("정상적으로 주문을 마쳤습니다.\n")
    }

    private fun getUser(id: Long, name: String): User {
        return User(id, name)
    }

    private fun getItem(id: Long, name: String, price: Long): Item {
        return Item(id, name, price)
    }

    private fun makeOrder(id: Long, user: User, item: Item): Order {
        if (user.isBlank()) {
            return Order(id, user, item, false)
        }
        return Order(id, user, item, true)
    }
}
