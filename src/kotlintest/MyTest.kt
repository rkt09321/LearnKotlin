package kotlintest

import kotlin.collections.HashMap

fun main() {
    var treeMap = mapOf<Int,String>()
    var hasMap = HashMap<Int,String>()
    MapTest().testAllFun()
    
    val hashMap:Float by lazy {
      3.14f
    }
    for (keys in treeMap.keys){

    }
    println("Sum = " + Program().addTwoNumber(57, 78, object : MyInterface {
        override fun addTwoNumber(a: Int, b: Int): Int {
            return a + b
        }

    }))
    println("Resultare ")
    println(Program().reverseString("Hello", { it.reversed() }))

    var program = Program()
    with(program) {
        raj = "Rajani Kant"
        anu = "Annu Pandey"
    }
    println(program.toString())
    program.apply {
        raj = "Rajani Kant Tiwari"
        anu = "Annu Pandey Tiwari"
    }
    println(program.toString())
}

class Program {
    var raj = ""
    var anu = ""
    override fun toString(): String {
        return raj + "\n" + anu
    }

    fun addTwoNumber(a: Int = 0, b: Int = 0, lambdaEx: (Int, Int) -> Unit) {
        lambdaEx(a, b)
    }

    fun reverseString(str: String, reverseStr: (String) -> String): String {
        return reverseStr(str)
    }

    fun addTwoNumber(a: Int = 0, b: Int = 0, mySum: MyInterface): Int {
        return mySum.addTwoNumber(a, b)
    }
}

interface MyInterface {
    fun addTwoNumber(a: Int = 0, b: Int = 0): Int
}