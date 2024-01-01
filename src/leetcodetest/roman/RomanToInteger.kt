package leetcodetest.roman

import java.util.HashMap

internal class RomanToInteger {
    fun romanToInt(s: String?): Int {
        // Returns 0 at the start of the function if the string is null
        if (s == null) {
            return 0
        }

        // Using hashtable with this problem will give us O(n) time complexity.
        val hashmap: MutableMap<Char, Int> = HashMap()
        hashmap['I'] = 1
        hashmap['V'] = 5
        hashmap['X'] = 10
        hashmap['L'] = 50
        hashmap['C'] = 100
        hashmap['D'] = 500
        hashmap['M'] = 1000

        // Initialize sum to the value of last character.
        var sum = hashmap[s[s.length - 1]]!!

        // We now compare the adjacent characters in the loop.
        // If the current character is greater than the adjacent right character,
        // we add the current value to our sum. Else we subtract it.
        for (i in s.length - 2 downTo 0) {
            if (hashmap[s[i]]!! >= hashmap[s[i + 1]]!!) {
                sum += hashmap[s[i]]!!
            } else {
                sum -= hashmap[s[i]]!!
            }
        }
        return sum
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(RomanToInteger().romanToInt("IXIV"))
        }
    }
}