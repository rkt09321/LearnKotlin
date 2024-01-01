package kotlintest.`1_4_new`

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 }

fun main() {
    println("Is 7 even? - ${isEven.accept(7)}")
    println(add(a=10,30,))
    print(add(50,b=30))

}

fun add(a: Int, b: Int): Int {
  return a+b
}