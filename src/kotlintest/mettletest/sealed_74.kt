package kotlintest.mettletest

sealed class Vegetable(val x: String) {
    class Onion : Vegetable("Onion")
    class Potato : Vegetable("Potato")
}

class Pumpkin : Vegetable("Pumpkin")

fun display(veg: Vegetable) {
    when (veg) {
        is Vegetable.Onion -> println("${veg.x} is good for health")
        is Vegetable.Potato -> println("${veg.x} is good for health")
        is Pumpkin -> println("${veg.x} is good for health")
    }
}

fun main() {
    val obj = Vegetable.Onion()
    val obj1 = Vegetable.Potato()
    val obj2 = Pumpkin()
    display(obj)
    display(obj1)
    display(obj2)
}

fun multiply(x: Int, y: Int): Int {
    return y * x * 8
}