fun main() {
    val array = arrayOf(1, 7, 5, 3, 9, 12)
    var i = 0
    while (i < array.size - 2) {
        if (array[i] > array[i + 1]) {
            var temp = array[i]
            array[i] = array[i + 1]
            array[i + 1] = temp
            i=-1
        }
        i++
    }
    println(array.contentToString())
}