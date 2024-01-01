package kotlintest.collectionframefork

//distinct()
fun main() {
    // Maintain the original order of items
    val listOne = listOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    val listTow = listOf("Sekhar", "Akabar", "Arora", "Kapoor", "Kapoor", "Mohata")
    val filteredList = listOne.filter { it.length % 2 == 0 } // filter element based on condition
    val filterIndexTo = listOne.filterIndexedTo(mutableListOf()) { index, _ -> index % 2 == 0 }
    println("Filtered Index List $filterIndexTo")
    println(listOne.union(listTow))
    print(listOne.distinct()) // [Amit, Ali, Sumit, Himanshu]
    println(listOne.toSet())
    println(listOne.toMutableSet())
    println(listOne.toHashSet())
    println(listOne.joinToString())
    println(listOne.joinToString(separator = " ", prefix = "Joining String ", postfix = "End"))
    val partition: Pair<List<String>, List<String>> = listOne.partition { it.length > 4 }
    println(partition)
    println(listOne.reduce { acc, s -> acc + s })
}