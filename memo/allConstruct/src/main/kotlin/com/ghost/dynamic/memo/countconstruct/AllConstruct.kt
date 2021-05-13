package com.ghost.dynamic.memo.countconstruct

data class Construction(
    val data: List<String>
)

fun allConstruct(
    target: String,
    words: List<String>,
    memo: MutableMap<String, List<Construction>> = mutableMapOf()
): List<Construction> {
    if (target.isEmpty()) return listOf(Construction(emptyList()))
    if (memo.containsKey(target)) return memo[target]!!
    return words.mapNotNull { word ->
        if (target.startsWith(word)) {
            allConstruct(target.substring(word.length), words).map { Construction(listOf(word) + it.data) }
        } else null
    }.fold(emptyList<Construction>(), { acc, list -> acc + list })
        .apply { memo[target] = this }

}