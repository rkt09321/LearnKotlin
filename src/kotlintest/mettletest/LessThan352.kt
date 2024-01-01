package kotlintest.mettletest

val list = listOf(1, 2, 3, 4, 5, 6)
fun method1(): List<Int> {
    val lessThan3: (Int) -> Boolean = { it < 3 }
    return list.filter(lessThan3)
}

fun method2(): List<Int> {
    fun lessThan3(value: Int) = value < 3
    return list.filter(::lessThan3)
}

fun method3(): List<Int> {
    return list.filter{ it < 3 }
}

fun method4(): List<Int> {
   return list.filter { value: Int -> value < 3 }
}

fun main() {
    println(method1())
    println(method2())
    println(method3())
    println(method4())
}