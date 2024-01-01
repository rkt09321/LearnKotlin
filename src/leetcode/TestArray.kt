package leetcode

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val array= arrayOf(intArrayOf(1,3),intArrayOf(2,6),intArrayOf(3,5),intArrayOf(7,10),intArrayOf(11,15),intArrayOf(18,30),intArrayOf(45,60))
    mergeArray(array, intArrayOf(5,8))
}

fun mergeArray(array: Array<IntArray>, intArrayOf: IntArray) {
    val arrayList: ArrayList<IntArray> =ArrayList(array.asList())
    arrayList.add(intArrayOf)
    arrayList.sortWith { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }

    val linkedList = LinkedList<IntArray>()
    arrayList.forEach { value ->
        if(linkedList.isEmpty()||linkedList.last[1]<value[0])
            linkedList.add(value)
        else {
            linkedList.last[1] = linkedList.last[1].coerceAtLeast(value[1])
        }
    }
    linkedList.forEach {
        print(" ${it[0]} ${it[1]}")
    }
}
