package leetcode.collectionrel

import java.util.*

// https://leetcode.com/problems/rotate-list/
fun main() {
    val array= intArrayOf(3,6,7,8,2)
    val list=array.toList()
    Collections.rotate(list,8)
    list.forEach {
        println(it)
    }
}