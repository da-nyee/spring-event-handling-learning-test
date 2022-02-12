package com.example.springeventhandling.domain

class Orders(
    private var id: Long,
    private var user: User,
    private var item: Item,
    private var isSuccess: Boolean
) {

    fun isFail(): Boolean {
        return !isSuccess
    }
}
