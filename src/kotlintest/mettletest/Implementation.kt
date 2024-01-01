package kotlintest.mettletest

class Implementation {
    companion object Function {
        var m: Int = 10
        fun kotlin() = println("Companion Object")
    }
}

fun main() {
//    println("Implementation.m")
//    Implementation.kotlin()
    val vehicle = listOf("car", "jeep", "motor", "cycle", "aeroplane")
    val (first, second) = vehicle.partition { it.length > 4 }
    println(first)
    println(second)
}