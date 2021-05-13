package com.ghost.dynamic.memo.cansum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CanSumTest {

    @Test
    fun test1() {
        Assertions.assertTrue(canSum(7, listOf(2, 3)))
    }

    @Test
    fun test2() {
        Assertions.assertTrue(canSum(7, listOf(5, 3, 4, 7)))
    }

    @Test
    fun test3() {
        Assertions.assertFalse(canSum(7, listOf(2, 4)))
    }

    @Test
    fun test4() {
        Assertions.assertTrue(canSum(8, listOf(2, 3, 5)))
    }

    @Test
    fun test5() {
        Assertions.assertFalse(canSum(300, listOf(7, 14)))
    }

    @Test
    fun test6() {
        Assertions.assertTrue(canSum(300, listOf(7, 8)))
    }

}