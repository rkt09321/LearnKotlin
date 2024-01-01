package kotlintest.mettletest

fun main() {
    val paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
    val banned = arrayOf("hit")
    val str = paragraph.toLowerCase().split("\\W+|\\s+".toRegex())
    val set: Map<String, Int> = str.filterNot { it in banned }.groupingBy { it }.eachCount()
    println(set.maxBy { it.value }?.key)
    var strBuilder = StringBuilder()
    "Codecademy is awesome!".toCharArray().forEach {
        if (it == ' ') {
            strBuilder.append(it)
        } else if (it == 'z' || it == 'Z') {
            strBuilder.append(it - 25)
        } else {
            strBuilder.append(it + 1)
        }
    }
    println(strBuilder)
}