package kotlintest.mettletest

data class Car68(val brand: String, val year: Int) {
    var id: Long = -1

    constructor(brand: String, year: Int, id: Long) : this(brand, year) {
        this.id = id
    }
}

fun main() {
    val car = Car68("ChevRolet", 3, 1)
    val car2 = car.copy().apply { id = 2 }
    println(car == car2)
    println(car)
    println(car2)
    val jvm = listOf("Kotlin", "Java", "Ruby")
    val objects: List<String> = jvm
    objects[0].also(::print)

    val colr = "RED"
    if(colr==="RED") println("RED") else println("Blue")
}