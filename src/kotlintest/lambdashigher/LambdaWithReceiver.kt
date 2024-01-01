fun main() {
    val sum: (Int, Int) -> Int = { a: Int, b: Int ->
        println("Sum of both is ${a + b}")
        a+b
    }
    StudentInfo().address { name ->
        println("$name is my best friend")
        "My Name is Rajani Kant Tiwari"
        getAge(10) // here AddressInfo object is passed as this
        10
    }
    sum(5, 8) {
        println("Testing with inline")
        // return
    }
    println("I will not Excecute")
    sum(52, 30)
    StudentInfo().lambdas(sum)
    StudentInfo().higherOrder(::sumtwo)
}
fun sumtwo() : Unit {

}