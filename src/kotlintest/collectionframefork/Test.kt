package kotlintest.collectionframefork

fun main() {
    val userList = listOf(
        User(3, "Rajani"),
        User(5, "Kant"),
        User(3, "SiaMuni"),
        User(4, "Raj"),
        User(5, "Tiwari"),
        User(6, "Shashi"),
        User(7, "Shyam"),
        User(4, "Babu"),
        User(6, "Abhishek"),
        User(7, "Prasad")
    )
    val find = userList.find { it.id == 3 } // return first element satisfy given predicate if nothing match return null
    val single = userList.find { it.id == 3 } // returns the single element matching the given condition or it will
    // throw an exception if there are more than one matching element or no
    // matching element in the list.
    val chunked = userList.chunked(3) // break your list into multiple sublist
    println(chunked)
    println("Find $find")
    println("Single $single")
    val groupMap: Map<Int, List<User>> = userList.groupBy { it.id }
    val associatedMap: Map<Int, String> = userList.associate { it.id to it.name }
    val associatedByMap: Map<Int, User> = userList.associateBy { it.id }
    println(groupMap)
    println(associatedMap)
    println(associatedByMap)

    println("Component1 ${userList.component1()}")
    println("Component2 ${userList.component2()}")
    println(userList.find { it.id == 3 })
    userList.iterator()

}