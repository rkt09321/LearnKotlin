package kotlintest.trickyquestion

fun main() {
    println(reverseString("This is a string"))
}

fun reverseString(str:String):String {
   return str.split(" ").reversed().joinToString(" ")
}
