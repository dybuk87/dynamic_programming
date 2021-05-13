package com.ghost.dynamic.memo.fib

fun fib(
    n: Int,
    memo: MutableMap<Int, Long> = mutableMapOf(0 to 0, 1 to 1)
): Long =
    when {
        memo.containsKey(n) -> memo[n]!!
        else -> {
            val value = fib(n - 2, memo) + fib(n - 1, memo)
            value.apply { memo[n] = this }
        }
    }

fun main() {

}