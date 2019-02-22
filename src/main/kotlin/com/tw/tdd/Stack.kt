package com.tw.tdd

class Stack {
    private var elements = IntArray(3)
    var cont = 0

    fun push(element: Int) {
        if (isFull()) {
            duplicateCapacity()
        }
        elements[cont++] = element

    }

    private fun duplicateCapacity() {
        val myElements = IntArray(cont * 2)
        for ((index, data) in elements.withIndex()) {
            myElements[index] = data
        }
        elements = myElements
    }

    private fun isFull() = elements.size == cont

    fun size(): Int {
        return cont
    }

    fun pop(): Int {
        return elements[--cont]
    }
}