package leetcode.arrayrelated

import java.util.*
import kotlin.collections.HashSet

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter row")
    val row=scanner.nextInt()
    println("Enter Col")
    val col=scanner.nextInt()
    val array= Array(row){IntArray(col)}
    val alRowZero=HashSet<Int>()
    val alColZero=HashSet<Int>()

    for (i in 0 until row){
        for (j in 0 until col) {
            array[i][j]=scanner.nextInt()
        }
    }
    for (i in 0 until row){
        for (j in 0 until col) {
            if(array[i][j]==0){
                alRowZero.add(i)
                alColZero.add(j)
            }
        }
    }
    for (i in 0 until row){
        for (j in 0 until col) {
            if(alRowZero.contains(i)||alColZero.contains(j)){
                array[i][j]=0
            }
        }
    }
println(array.contentToString())
}