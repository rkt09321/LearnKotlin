package hackerranktest

import java.lang.NumberFormatException
import java.util.*

/**
 * Every character in the input string is followed by its frequency.
Write a function to decrypt the string and find the nth character of the decrypted string. If no character exists at that positionthen then return "-1".
For eg:- If the input string is "a2b3" the decrypted string is "aabbb".
Note: The frequency of encrypted string cannot be greater than a single digit i.e.<10.

Explanation:

The decrypted string is "abccc", hence the 5th character in the decrypted string is "c".
Input : Input Specification:
Input1: A string.
Input2:5


Output :
 */
fun main(array: Array<String>) {

    println("Enter Str")
    val str=Scanner(System.`in`).next()
    var originalStr=""
    for (i in str.indices){
        try {
            val number=Integer.parseInt(str[i].toString())
            for (j in 0 until number-1){
                originalStr+= str[i-1].toString()
            }
        }catch (ex:NumberFormatException){
            originalStr+= str[i].toString()
        }
    }
    println(originalStr)
    println(originalStr[originalStr.length-1])
}