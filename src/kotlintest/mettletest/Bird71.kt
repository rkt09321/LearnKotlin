package kotlintest.mettletest

open class Bird71
class Crow : Bird71()
fun Bird71.myName() = "Bird"
fun Crow.myName() = "Crow"
fun printMyName(bird71: Bird71) {
    println(bird71.myName())
}

fun main() {
    printMyName(Crow())
}