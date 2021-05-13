package com.ghost.dynamic.memo.fib

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FibDynamicTest {

    @Test
    fun test_fib_0() {
        Assertions.assertEquals(0L, fib(0))
    }

    @Test
    fun test_fib_1() {
        Assertions.assertEquals(1L, fib(1))
    }

    @Test
    fun test_fib_2() {
        Assertions.assertEquals(1L, fib(1))
    }

    @Test
    fun test_fib_5() {
        Assertions.assertEquals(5L, fib(5))
    }

    @Test
    fun test_fib_8() {
        Assertions.assertEquals(21L, fib(8))
    }

    @Test
    fun test_fib_10() {
        Assertions.assertEquals(55L, fib(10))
    }

    @Test
    fun test_fib_13() {
        Assertions.assertEquals(233L, fib(13))
    }

    @Test
    fun test_fib_17() {
        Assertions.assertEquals(1597L, fib(17))
    }

    @Test
    fun test_fib_19() {
        Assertions.assertEquals(4181L, fib(19))
    }


    @Test
    fun test_fib_50() {
        Assertions.assertEquals(12586269025L, fib(50))
    }

    @Test
    fun test_fib_83() {
        Assertions.assertEquals(99194853094755497L, fib(83))
    }

}