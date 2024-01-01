package kotlintest.mettletest

import kotlin.RuntimeException

class ExceptionHandling54 {
    fun exceptionHandling() {
        println("Print 1")
        try {
            println("Print 2")
        } catch (ex: RuntimeException) {
            println("Print 3")
        }
    }
}

fun main() {
    ExceptionHandling54().exceptionHandling()
    val result = try {
        throw RuntimeException()
    } catch (ex: RuntimeException) {
        14
    }
    println(result)
}

