package hackerranktest

import java.util.*

fun main(args:Array<String>) {
    val arrayee=Array(3){IntArray(4)}
    val arraye=Array(3){Array(4){""}}
    arraye[0][0]="Foo"
    println("Enter Number")
    val scanner=Scanner(System.`in`)
    val number=scanner.next()
    var firstLargest=Int.MIN_VALUE
    var secondLargest=Int.MIN_VALUE
    val array=IntArray(number.length)
    for (i in number.indices) {
        array[i]=Integer.parseInt(number[i].toString())
    }
    for (i in array.indices) {
        if(array[i]>firstLargest){
            secondLargest=firstLargest
            firstLargest=array[i]
        } else if(array[i]>secondLargest && array[i]<firstLargest){
               secondLargest=array[i]
        }
    }
    println("Second Largest $secondLargest")
}