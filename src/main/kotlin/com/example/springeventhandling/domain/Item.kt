package com.example.springeventhandling.domain

class Item(private var id: Long, private var name: String, private var price: Long) {

    fun getName(): String {
        return name
    }

    fun getPrice(): Long {
        return price
    }
}
