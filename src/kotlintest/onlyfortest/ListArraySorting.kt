package kotlintest.onlyfortest

fun main() {
    val numbers: IntArray = intArrayOf(10, 20, 30, 40, 50,21)
    val sum = numbers.sum()
    val max=numbers.maxOrNull()
    println(sum-max!!)
    val al=ArrayList<Int>()
    al.add(10)
    al.add(20)
    al.add(30)
    al.add(40)
    al.add(50)
    al.add(21)

    val maximum=al.maxOrNull()
    val sume = al.sum()
   // println(sume-maximum!!)
}