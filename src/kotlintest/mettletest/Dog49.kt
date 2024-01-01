package kotlintest.mettletest

data class Dog49(val id: Long, val name: String, val age: Int)

fun main() {
    val (_,x) = Dog49(1, "capy", 3)
    println(x)
}