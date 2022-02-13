package com.example.springeventhandling.domain

import com.example.springeventhandling.domain.event.OrderEvent

interface Notification {

    fun send(orderEvent: OrderEvent)
}
