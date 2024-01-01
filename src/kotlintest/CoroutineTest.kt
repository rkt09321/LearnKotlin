package kotlintest

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch(Dispatchers.Default) {
            try {
                for (i in 0..100) {
                    delay(10)
                }
            } catch (ex: CancellationException) {
                println("Exception Caught")
            } finally {
                delay(20)
                add(5, 10)
                println("Finally block executed")
            }
        }
    }
}

suspend fun add(a: Int, b: Int) {
    println("Sum ${a + b}")
}