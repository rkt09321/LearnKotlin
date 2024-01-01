package kotlintest.mettletest

class Vehicle70 {
    fun printVehicleName() {
        println("BMW")
    }
}

fun Vehicle70.printVehicleName() {
    println("Audy")
}

fun main() {
    Vehicle70().printVehicleName()
}