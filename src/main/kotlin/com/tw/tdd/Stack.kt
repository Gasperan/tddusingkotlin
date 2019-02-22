package com.tw.tdd

class Stack {
    private val data = IntArray(2)
    private var index : Int = 0

    fun push(element: Int) {
        data[index++] = element
    }

    fun size(): Int {
        return index
    }

    fun pop(): Int {
        return data[--index]
    }
}