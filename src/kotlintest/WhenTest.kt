package kotlintest

fun main() {
    val test: Int? = 10
    when (test) {
        null -> println("Null String")
        10 -> println("10 String")
        20 -> println("20 String")
    }
}