package kotlintest

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking{
    val channel= Channel<Int>(3)
    launch {
      for (i in 0..5) {
          println("Send $i")
          channel.send(i)
      }
    }
    launch {
        for (i in channel) {
            println("Receive $i")
        }
    }

}