package kotlintest.trickyquestion

import java.util.*

fun main() {
    println(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8).leftShift(10).contentToString())
}

fun IntArray.leftShift(k:Int):IntArray {
    var shiftedArray = copyOf()
    var rotatedBy = k
    if(rotatedBy >size) {
        rotatedBy %= size
    }
    forEachIndexed{ index, value ->
        var shiftedIndex = ((index + (size-rotatedBy))) % size
        shiftedArray[shiftedIndex] = value
    }
   return shiftedArray
}
