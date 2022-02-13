package com.example.springeventhandling.domain.event

import com.example.springeventhandling.domain.Order

class OrderEvent(private val order: Order) {

    fun getOrder(): Order {
        return order
    }
}
