package com.tw.tdd

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StackTest {

    @Test
    fun firstTest() {
        assertEquals(1,1)
    }

    @Test
    fun pushOneElement() {
        val stack = Stack()

        stack.push(6)

        assertEquals(stack.size(), 1)
    }

    @Test
    fun push2Elements() {
        val stack = Stack()

        stack.push(6)
        stack.push(6)

        assertEquals(stack.size(), 2)
    }

    @Test
    fun popElement() {
        val stack = Stack()
        stack.push(6)

        val result = stack.pop()

        assertEquals(result, 6)
    }

    @Test
    fun popTwoElements() {
        val stack = Stack()
        stack.push(6)
        stack.push(9)

        val firstResult = stack.pop()
        val secondResult = stack.pop()

        assertEquals(firstResult, 9)
        assertEquals(secondResult, 6)
    }
}