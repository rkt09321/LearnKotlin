package leetcode.arrayrelated

import java.util.*
import kotlin.Array
import kotlin.collections.ArrayList

fun main() {
    val array= arrayOf(intArrayOf(1,3),intArrayOf(2,5),intArrayOf(3,7),intArrayOf(9,15),intArrayOf(11,30),intArrayOf(41,50))
    mergeA(array, intArrayOf(2,8))
}

fun mergeA(array: Array<IntArray>, intArrayOf: IntArray) {
    val arrayList=ArrayList<IntArray>(array.asList())
    arrayList.add(intArrayOf)
    arrayList.sortWith { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) }
    val linkedList=LinkedList<IntArray>()
    arrayList.forEach{
        if(linkedList.isEmpty() || linkedList.last[1]<it[0])
            linkedList.add(it)
        else
            linkedList.last[1]= linkedList.last[1].coerceAtLeast(it[1])
    }
    linkedList.forEach{
        print(" ${it[0]} ${it[1]}")
    }
}
