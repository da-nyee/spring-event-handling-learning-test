package com.example.springeventhandling.domain

class User(private var id: Long, private var name: String) {

    fun getName(): String {
        return name
    }

    fun isBlank(): Boolean = name.isBlank()
}
