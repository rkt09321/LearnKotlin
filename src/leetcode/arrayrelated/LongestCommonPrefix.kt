package leetcode.arrayrelated

import kotlin.Array

// https://leetcode.com/problems/longest-common-prefix/
fun main() {
    val strs = arrayOf("flower","flow","flight")
    println(longestCommonPrefix(strs))
}
fun longestCommonPrefix(strs: Array<String>): String? {
    if (strs == null || strs.isEmpty()) return ""
    for (i in strs[0].indices) {
        val c = strs[0][i]
        for (j in 1 until strs.size) {
            if (i == strs[j].length || strs[j][i] != c)
                return strs[0].substring(0, i)
        }
    }
    return strs[0]
}