package kotlintest.collectionframefork

fun main() {
    val students = arrayOf(10, 9, 23, 12, 5, 2, 4, 1)
    for (i in 0..students.size) {

    }
    val sortedArray = students.sorted() // sort array into ascending order
    println(sortedArray)
    students.sort(0, 5)
    println(students.contentToString()) // sort array only 0 to 4th index remains will be same
}