package hackerranktest

import java.util.*
class GetStringLengthRecursive {
    var len=0
    fun main(array: Array<String>) {
        println("Enter String")
        val stringAre = Scanner(System.`in`).next()
        val length = getStringLen(stringAre.toCharArray())
        println("Length are $length")
    }

    private fun getStringLen(toCharArray: CharArray): Int {
        if (toCharArray[len] != null) {
            len++
            getStringLen(toCharArray)
        } else {
            return len
        }
        return 0
    }
}
