package com.ghost.dynamic.memo.bestsum

class HowSumMemo(
    val result : List<Int>? = null
)

fun bestSum(
    target: Int,
    numbers: List<Int>,
    memo: MutableMap<Int, HowSumMemo> = mutableMapOf(0 to HowSumMemo(emptyList()))
): List<Int>? {
    if (memo.containsKey(target)) return memo[target]?.result
    if (target < 0) return null
    return numbers.mapNotNull { value -> bestSum(target - value, numbers, memo)?.let { it + value } }
        .fold(HowSumMemo(null), { acc, current ->
            if (acc.result == null || acc.result.size > current.size) {
                HowSumMemo(current)
            } else {
                acc
            }
        })
        .apply { memo[target] = this  }
        .result
}