package com.example.springeventhandling.application.dto

data class OrderRequestDto(
    val orderId: Long,
    val userId: Long,
    val userName: String,
    val itemId: Long,
    val itemName: String,
    val itemPrice: Long
)
