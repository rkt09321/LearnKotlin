package kotlintest

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    StaticInitConstructorTest("Rajani","Tiwari")
//    val list=ArrayList<String>()
//    list.add("MyName")
//    list.mapIndexed { idx, value ->
//        println("$idx $value")
//    }
//    println( list.associateWith { it.length  })
//    runBlocking {
//        async {
//            call()
//        }
//        println("I am Executing")
//        val no = 5
//        val doubled = List(4) { it * 2 }
//         MyFun(4) {
//              println(it)
//         }
//    }
}

inline fun <T> MyFun(no: Int, receiver: (a: String) -> T) {
      receiver("MyName is Flashing")
}

suspend fun call() {
    delay(200)
    println("delay")
}
