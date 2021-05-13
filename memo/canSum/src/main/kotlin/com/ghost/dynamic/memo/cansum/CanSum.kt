package com.ghost.dynamic.memo.cansum

fun canSum(targetSum: Int, numbers: List<Int>, memo: MutableMap<Int, Boolean> = mutableMapOf()): Boolean =
    when {
        memo.containsKey(targetSum) -> memo[targetSum]!!
        targetSum < 0 -> false
        targetSum == 0 -> true
        else -> {
            val result = numbers.firstOrNull { canSum(targetSum - it, numbers, memo) }?.let { true } ?: false
            result.apply { memo[targetSum] = this }
        }
    }

