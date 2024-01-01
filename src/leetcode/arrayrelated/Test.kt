package leetcode.arrayrelated

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val arr= arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
    print(longestPrefix(arr))
}

fun longestPrefix(arr: Array<IntArray>) {
    val arrList=ArrayList<IntArray>()
    arrList.addAll(arr.asList())

    Arrays.sort(arr){a:IntArray,b:IntArray->a[0].compareTo(b[0])}
    val linkedList=LinkedList<IntArray>()
    arr.forEach {
        if (linkedList.isEmpty() || linkedList.last[1]<it[0]) {
            linkedList.add(it)
        }else {
            linkedList.last[1]=it[1]
        }
    }
    linkedList.forEach {
        println("${it[0]} ${it[1]}")
    }
}
