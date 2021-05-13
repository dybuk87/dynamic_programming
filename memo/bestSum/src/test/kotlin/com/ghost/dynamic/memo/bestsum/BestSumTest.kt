package com.ghost.dynamic.memo.bestsum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BestSumTest {

    @Test
    fun test1() {
        Assertions.assertArrayEquals(intArrayOf(7), bestSum(7, listOf(5, 3, 4, 7))?.toIntArray())
    }

    @Test
    fun test2() {
        Assertions.assertArrayEquals(intArrayOf(5, 3), bestSum(8, listOf(2, 3, 5))?.toIntArray())
    }

    @Test
    fun test3() {
        Assertions.assertArrayEquals(intArrayOf(4, 4), bestSum(8, listOf(1, 4, 5))?.toIntArray())
    }

    @Test
    fun test4() {
        Assertions.assertArrayEquals(intArrayOf(25, 25, 25, 25), bestSum(100, listOf(1, 2, 5, 25))?.toIntArray())
    }

}