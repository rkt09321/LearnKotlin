package leetcode.arrayrelated
// https://leetcode.com/problems/climbing-stairs/
fun main() {
    println("Way to go to Stairs")
    println(noOfStairs(4))
}

fun noOfStairs(no: Int):Int {
     var first=1
     var sec=2
    for (i in 3..no){
        val third=first+sec
        first=sec
        sec=third
    }
    return sec
}
