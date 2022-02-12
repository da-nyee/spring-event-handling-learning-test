package com.example.springeventhandling.domain

interface Notification {

    fun send(order: Order): String
}
