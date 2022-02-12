package com.example.springeventhandling.domain

class Order(
    private var id: Long,
    private var user: User,
    private var item: Item,
    private var isSuccess: Boolean
) {

    fun getUserName(): String {
        return user.getName()
    }

    fun getItemName(): String {
        return item.getName()
    }

    fun getItemPrice(): Long {
        return item.getPrice()
    }

    fun isFail(): Boolean {
        return !isSuccess
    }
}
