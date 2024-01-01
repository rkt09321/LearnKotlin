package kotlintest.mettletest

class Spider56(
    val name: String = "Archie",
    val color: String = "Black",
    val size: Long = 18,
    val age: Int = 1
)

fun main() {
    Spider56()
    Spider56("")
    Spider56("","")
    Spider56("", size = 1)

}