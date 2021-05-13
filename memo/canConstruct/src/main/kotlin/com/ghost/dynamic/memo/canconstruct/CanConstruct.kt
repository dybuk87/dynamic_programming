package com.ghost.dynamic.memo.canconstruct

fun canConstruct(
    target: String,
    words: List<String>,
    memo: MutableMap<String, Boolean> = mutableMapOf()
): Boolean =
    when {
        memo.containsKey(target) -> memo[target]!!
        target.isEmpty() -> true
        else -> {
            val result = words.firstOrNull { word ->
                if (target.startsWith(word)) {
                    canConstruct(target.substring(word.length), words, memo)
                } else false
            } != null

            result.apply { memo[target] = this }
        }
    }