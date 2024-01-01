package kotlintest.mettletest

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class Dog41(val age: Int,val name: String = "Chappy")
fun main(){
    GlobalScope.launch {
        val timeInMillis=measureTimeMillis {
            val one = one()
            val two = two()
            println(one+two)
        }
        println("timeInMillis $timeInMillis")
    }
    val dog = Dog41(2)
    println("$dog.name has ${dog.age}")
    Thread.sleep(5000)
}

suspend fun one(): Int {
    return withContext(Dispatchers.Default) {
        delay(2000)
        return@withContext 10
    }
}

suspend fun two(): Int {
    return withContext(Dispatchers.Default) {
        delay(2000)
        return@withContext 10
    }
}