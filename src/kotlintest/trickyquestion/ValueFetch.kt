package kotlintest.trickyquestion

data class ValueFetch(var codeName:String,var version:String);

fun main() {
    val getData=ValueFetch("Chili Peper","2.10")
    println(getData.component1())
}