package javatest.searching

fun main() {
    val array = arrayOf(Item("Raj", 20), Item("Ramayan", 100), Item("Rajia", 120),
        Item("Rajia Sultan", 210))
    val itemArray=getNumber(310, array)
    println(itemArray.contentToString())
}

fun getNumber(no: Int, arrays: Array<Item>): Array<Item> {
    val array = Array(2) { Item("", 0) }
    val hm = HashMap<Int, Item>()
    for (i in arrays.indices) {
        val item =arrays[i]
        if(hm.containsKey(no-item.price)) {
            array[0]= item
            array[1]= hm[no-item.price]!!
            return array
        } else {
            hm[item.price] = item
        }
    }
    return array
}
