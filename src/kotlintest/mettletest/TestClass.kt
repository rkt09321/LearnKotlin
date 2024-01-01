package kotlintest.mettletest

fun main() {
    val str = "Brownfoxjumbintodog"
    val arr = setOf('a', 'e', 'i', 'o', 'u')
    println( str.filter {
        it !in arr
    })
    val array = arrayOf(2, 5, 66, 3, 7, 8, 9, 32, 11)
    println(array.runningReduce { sum, element -> sum + element }.toIntArray().contentToString())
    for (i in array.indices - 5) {
        print(" ${array[i]}")
    }
    println(array.contentToString())
    var start = 0
    var end = array.size - 1
    while (start < end) {
        if (array[start] % 2 == 0) {
            start++
        } else if (array[end] % 2 != 0) {
            end--
        }
        if (array[start] % 2 != 0 && array[end] % 2 == 0) {
            val temp = array[start]
            array[start] = array[end]
            array[end] = temp
            start++
            end--
        }
    }
    println(array.contentToString())
}