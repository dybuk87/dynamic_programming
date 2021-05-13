package com.ghost.dynamic.memo.gridtraveler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class GridTravelerTest {

    @Test
    fun test_1_1() {
        Assertions.assertEquals(1, gridTraveler(1,1))
    }

    @Test
    fun test_2_3() {
        Assertions.assertEquals(3, gridTraveler(2,3))
    }

    @Test
    fun test_3_2() {
        Assertions.assertEquals(3, gridTraveler(3,2))
    }

    @Test
    fun test_3_3() {
        Assertions.assertEquals(6, gridTraveler(3,3))
    }

    @Test
    fun test_18_18() {
        Assertions.assertEquals(2333606220, gridTraveler(18,18))
    }

    @Test
    fun test_30_30() {
        Assertions.assertEquals(30067266499541040L, gridTraveler(30,30))
    }

    @Test
    fun test_40_40() {
        Assertions.assertEquals(8067360477443382000L, gridTraveler(40,40))
    }
}