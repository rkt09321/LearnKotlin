package kotlintest.trickyquestion

enum class EnumClass{OPEN,CLOSE,SENDING}

fun main() {
    println(EnumClass.SENDING.ordinal)
}