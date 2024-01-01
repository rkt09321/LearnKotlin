package leetcode.stringrelated
import java.util.HashMap
fun main(array: Array<String>) {
    println(lengthOfLongestSubstring("Rajkumari Singh"))

}

fun lengthOfLongestSubstring(s: String): Int {
    val n = s.length
    var ans = 0
    var largeStr=""
    val map: MutableMap<Char, Int> = HashMap() // current index of character
    // try to extend the range [i, j]
    var j = 0
    var i = 0
    while (j < n) {
        if (map.containsKey(s[j])) {
            i = Math.max(map.get(s[j])!!, i)
        }
        ans = Math.max(ans, j - i + 1)
        map[s[j]] = j + 1
        j++
    }
    print(largeStr)
    return ans
}
