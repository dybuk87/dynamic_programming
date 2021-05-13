package com.ghost.dynamic.memo.countconstruct

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountConstructTest {

    @Test
    fun test1() {
        Assertions.assertEquals(2, countConstruct("purple", listOf("purp", "p", "ur", "le", "purpl")))
    }

    @Test
    fun test2() {
        Assertions.assertEquals(3, countConstruct("abcdef", listOf("ab", "abc", "cd", "def", "abcd", "ef")))
    }

    @Test
    fun test3() {
        Assertions.assertEquals(0, countConstruct("skateboard", listOf("bo", "rd", "ate", "t", "ska", "sk", "boar")))
    }

    @Test
    fun test4() {
        Assertions.assertEquals(4, countConstruct("enterapotentpot", listOf("a", "p", "ent", "enter", "ot", "o", "t")))
    }

    @Test
    fun test5() {
        Assertions.assertEquals(121181, countConstruct("eeeeeeeeeeeeeeeeee", listOf("e", "ee", "eee", "eeee", "eeeee", "eeeeee", "eeeeeeee")))
    }

    @Test
    fun test6() {
        Assertions.assertEquals(8, countConstruct("eeee", listOf("e", "ee", "eee", "eeee")))
    }

}