package com.ghost.dynamic.memo.countconstruct

fun countConstruct(target: String, words: List<String>, memo: MutableMap<String, Long> = mutableMapOf()): Long =
    when {
        target.isEmpty() -> 1
        memo.containsKey(target) -> memo[target]!!
        else ->
            words.mapNotNull { word ->
                if (target.startsWith(word)) {
                    countConstruct(target.substring(word.length), words)
                } else null
            }.fold(0L, { acc, value -> acc + value })
                .apply { memo[target] = this }
    }