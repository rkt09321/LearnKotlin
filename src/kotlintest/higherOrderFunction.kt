package kotlintest

fun main() {
    val arrayList = arrayListOf<String>("A","BB","CCDD","ABCDEF")
    arrayList.forEach {
        println(getStringSize(it,::getLength))
    }

}

fun getLength(str: String) : Int {
    return str.length
}

fun getStringSize(str:String,getLength:(String)->Int) : Int {
    return getLength(str)
}
