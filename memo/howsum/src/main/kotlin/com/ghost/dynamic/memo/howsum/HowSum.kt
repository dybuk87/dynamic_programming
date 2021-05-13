package com.ghost.dynamic.memo.howsum

class HowSumMemo(
    val result : List<Int>? = null
)

fun howSum(
    target: Int,
    numbers: List<Int>,
    memo: MutableMap<Int, HowSumMemo> = mutableMapOf(0 to HowSumMemo(emptyList()))
): List<Int>? {
    if (memo.containsKey(target)) return memo[target]?.result
    if (target < 0) return null
    return numbers.mapNotNull { value -> howSum(target - value, numbers, memo)?.let { it + value } }
        .firstOrNull()
        .apply { memo[target] =  HowSumMemo(this)  }
}
