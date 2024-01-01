package kotlintest.trickyquestion

class Question5 {
    fun show() {
        val numbers= listOf("one","two","three","four")

        println(numbers.any { it.endsWith("e") })
        println(numbers.any { it.endsWith("a") })
        println(numbers.all { it.endsWith("a") })
        println(emptyList<Int>().all { it>5 })

    }
}

fun main() {
   Question5().show()
}