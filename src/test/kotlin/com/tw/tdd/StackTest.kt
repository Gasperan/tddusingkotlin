package com.tw.tdd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StackTest {
    lateinit var stack : Stack

    @BeforeEach
    fun setUp() {
        stack = Stack()
    }

    @Test
    fun pushOneElement() {
        stack.push(6)

        assertEquals(stack.size(), 1)
    }

    @Test
    fun pushTwoElement() {
        stack.push(6)
        stack.push(6)

        assertEquals(stack.size(), 2)
    }

    @Test
    fun pushesAndPopOneElement() {
        stack.push(6)

        val six = stack.pop()
        assertEquals(six, 6)
    }

    @Test
    fun pushesTwoPopsTwoElements() {
        stack.push(5)
        stack.push(7)

        val seven = stack.pop()
        val five = stack.pop()

        assertEquals(seven, 7)
        assertEquals(five, 5)

    }
    @Test
    fun pushesFourElements() {
        stack.push(5)
        stack.push(7)
        stack.push(8)
        stack.push(7)

        assertEquals(stack.size(), 4)
    }

}