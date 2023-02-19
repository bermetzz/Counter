package com.example.counter

interface View {
    fun showCount(count: Int)
    fun showToast(message: String)
    fun setColor(color: Int)
}