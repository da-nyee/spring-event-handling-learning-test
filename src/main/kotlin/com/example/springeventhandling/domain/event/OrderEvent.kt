package com.example.springeventhandling.domain.event

import com.example.springeventhandling.domain.Order
import com.example.springeventhandling.infrastructure.EmailNotification
import com.example.springeventhandling.infrastructure.KakaotalkNotification

class OrderEvent(
    private val order: Order,
    private val emailNotification: Boolean,
    private val kakaotalkNotification: Boolean
) {

    fun getUserName(): String {
        return order.getUserName()
    }

    fun getItemName(): String {
        return order.getItemName()
    }

    fun getItemPrice(): Long {
        return order.getItemPrice()
    }

    fun isEmailNotification(): Boolean {
        return emailNotification
    }

    fun isKakaoNotification(): Boolean {
        return kakaotalkNotification
    }
}
