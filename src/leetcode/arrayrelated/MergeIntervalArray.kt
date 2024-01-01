package leetcode.arrayrelated

import java.util.*
import kotlin.Array

//https://leetcode.com/problems/merge-intervals/

fun main() {
    val array = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
    mergeArray(array)
}

fun mergeArray(array: Array<IntArray>) {
    Arrays.sort(array) { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }
    val linkedList=LinkedList<IntArray>()
    array.forEachIndexed { _, value ->
        if(linkedList.isEmpty() || linkedList.last[1]<value[0]) {
            linkedList.add(value)
        } else {
            linkedList.last[1] = linkedList.last[1].coerceAtLeast(value[1])
        }
    }
    linkedList.forEach {
        print("[${it[0]} ${it[1]}]")
    }
}
