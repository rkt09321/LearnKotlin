package kotlintest.onlyfortest

fun main() {
    val hashMap=HashMap<Int,String>()
    hashMap[10] = "B"
    hashMap[15] = "C"
    hashMap[12] = "A"
    hashMap[18] = "E"
    hashMap[9] = "D"
    val sortTest=hashMap.toSortedMap(compareByDescending { it })
    for ((key,value) in sortTest) {
        println("$key $value")
    }
    println("Sorted Map Are")
    // sorted Map by Value
//    val sortedMap=hashMap.toList().sortedBy { (_,value) -> value }.toMap()


    // Other way to sort Map
    val sortedMap=hashMap.entries.sortedByDescending {  it.value }


    for ((key,value) in sortedMap) {
        println("$key $value")
    }
}