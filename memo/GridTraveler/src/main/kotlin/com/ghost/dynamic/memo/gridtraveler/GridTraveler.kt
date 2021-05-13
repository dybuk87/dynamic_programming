package com.ghost.dynamic.memo.gridtraveler

fun gridTraveler(
    m: Int, n: Int,
    memo: MutableMap<Pair<Int, Int>, Long> = mutableMapOf(Pair(1, 1) to 1)
): Long =
    (m to n).let { key ->
        when {
            m == 0 || n == 0 -> 0
            memo.containsKey(key) -> memo[key]!!
            else -> {
                val value = gridTraveler(m - 1, n, memo) + gridTraveler(m, n - 1, memo)
                value.apply { memo[key] = this }
            }
        }
    }