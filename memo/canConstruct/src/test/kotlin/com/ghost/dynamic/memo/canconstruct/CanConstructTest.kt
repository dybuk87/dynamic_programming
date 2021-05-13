package com.ghost.dynamic.memo.canconstruct

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CanConstructTest {

    @Test
    fun test1() {
        Assertions.assertTrue(canConstruct("abcdef", listOf("ab", "abc", "cd", "def", "abcd")))
    }

    @Test
    fun test2() {
        Assertions.assertFalse(canConstruct("skateboard", listOf("bo", "rd", "ate", "t", "ska", "sk", "boar")))
    }

    @Test
    fun test3() {
        Assertions.assertTrue(canConstruct("enterapotentpot", listOf("a", "p", "ent", "enter", "ot", "o", "t")))
    }

    @Test
    fun test4() {
        Assertions.assertFalse(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", listOf("e", "ee", "eee", "eeee", "eeeeee", "eeeeeee")))
    }

    @Test
    fun test5() {
        Assertions.assertTrue(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", listOf("e", "ee", "eee", "eeee", "eeeeee", "eeeeeee", "f")))
    }
}
    