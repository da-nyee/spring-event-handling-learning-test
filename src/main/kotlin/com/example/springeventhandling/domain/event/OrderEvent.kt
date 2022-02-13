package com.example.springeventhandling.domain.event

import com.example.springeventhandling.domain.Order

class OrderEvent(private val order: Order) {

    fun getUserName(): String {
        return order.getUserName()
    }

    fun getItemName(): String {
        return order.getItemName()
    }

    fun getItemPrice(): Long {
        return order.getItemPrice()
    }
}
