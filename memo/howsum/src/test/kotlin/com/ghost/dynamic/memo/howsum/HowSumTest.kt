package com.ghost.dynamic.memo.howsum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HowSumTest {

    @Test
    fun test1() {
        Assertions.assertArrayEquals(intArrayOf(3, 2, 2), howSum(7, listOf(2, 3))?.toIntArray())
    }

    @Test
    fun test2() {
        Assertions.assertArrayEquals(intArrayOf(4, 3), howSum(7, listOf(5, 3, 4, 7))?.toIntArray())
    }

    @Test
    fun test3() {
        Assertions.assertNull(howSum(7, listOf(2, 4)))
    }

    @Test
    fun test4() {
        Assertions.assertArrayEquals(intArrayOf(2, 2, 2, 2), howSum(8, listOf(2, 3, 5))?.toIntArray())
    }

    @Test
    fun test5() {
        Assertions.assertNull(howSum(300, listOf(7, 14))?.toIntArray())
    }

    @Test
    fun test6() {
        val expected = IntArray(6) { 8 } + IntArray(36) { 7 }
        Assertions.assertArrayEquals(expected, howSum(300, listOf(7, 8))?.toIntArray())
    }

}