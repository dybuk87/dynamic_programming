package com.ghost.dynamic.memo.countconstruct

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AllConstructTest {

    @Test
    fun test1() {
        assertEqual(
            listOf(
                Construction(listOf("purp", "le")),
                Construction(listOf("p", "ur", "p", "le"))
            ), allConstruct("purple", listOf("purp", "p", "ur", "le", "purpl"))
        )
    }

    @Test
    fun test2() {
        assertEqual(
            listOf(
                Construction(listOf("ab", "cd", "ef")),
                Construction(listOf("ab", "c", "def")),
                Construction(listOf("abc", "def")),
                Construction(listOf("abcd", "ef"))
            ), allConstruct("abcdef", listOf("ab", "abc", "cd", "def", "abcd", "ef", "c"))
        )
    }

    @Test
    fun test3() {
        assertEqual(
            emptyList(),
            allConstruct("skateboard", listOf("bo", "rd", "ate", "t", "ska", "sk", "boar"))
        )
    }

    @Test
    fun test4() {
        assertEqual(listOf(
            Construction(listOf("e", "e", "e", "e")),
            Construction(listOf("ee", "e", "e")),
            Construction(listOf("e", "ee", "e")),
            Construction(listOf("e", "e", "ee")),
            Construction(listOf("eee", "e")),
            Construction(listOf("e", "eee")),
            Construction(listOf("eeee")),
            Construction(listOf("ee", "ee")),
        ), allConstruct("eeee", listOf("e", "ee", "eee", "eeee")))
    }
}

fun assertEqual(expected: List<Construction>, result: List<Construction>) {
    Assertions.assertEquals(expected.size, result.size)
    expected.forEach { testConstruction ->
        Assertions.assertTrue(result.contains(testConstruction), "does not contains: $testConstruction \n " +
                result.joinToString(prefix = "[\n", postfix = "]\n", separator = "") {
                    construction -> construction.data.joinToString(prefix = "\t[", postfix = "],\n", separator = ", ") { it }
                })
    }
}