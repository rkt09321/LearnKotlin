package kotlintest.trickyquestion

class Question4 {
    fun show() {
        val numbers= listOf("one","two","three","four")
        val filterIdx = numbers.filterIndexed {
                index, s -> (index!=0) && (s.length < 5)
        }
        val filterNot = numbers.filterNot {
            it.length<=3
        }
        println(filterIdx)
        println(filterNot)
    }
}

fun main() {
   Question4().show()
}