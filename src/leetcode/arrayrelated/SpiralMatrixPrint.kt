package leetcode.arrayrelated
// https://leetcode.com/problems/spiral-matrix/
import java.util.*
import kotlin.Array

fun main(){
    val scanner=Scanner(System.`in`)
    println("Enter Number Of Row")
    val row=scanner.nextInt()
    println("Enter Number Of Col")
    val column=scanner.nextInt()
    val array=Array(row){IntArray(column)}
    var number=1
    for (i in 0 until row) {
        for (j in 0 until column) {
            array[i][j]=number
            number+=1
            print("${array[i][j]} ")
        }
        println()
    }
    println("Enter Number Of Row")
     printArraySpiral(array)
}

fun printArraySpiral(array: Array<IntArray>) {
    var minRow=0
    var maxRow=array.size-1
    var minCol=0
    var maxCol=array[0].size-1
    var start=0
    var noOfRowCol=array.size*array[0].size
    while (start<noOfRowCol){
        for(i in minCol.rangeTo(maxCol)) {
            print("${array[minRow][i]} ")
            start++
        }
        println()
        for (i in (minRow+1).rangeTo(maxRow)) {
            print("${array[i][maxCol]} ")
            start++
        }
        println()
        for (i in maxCol-1 downTo minCol) {
            print("${array[maxRow][i]} ")
            start++
        }
        println()
        for (i in maxRow-1 downTo  minRow+1) {
            print("${array[i][minCol]} ")
            start++
        }
        println()
        minRow++
        maxRow--
        minCol++
        maxCol--


    }

}
