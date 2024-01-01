inline fun sum(a: Int, b: Int,crossinline block: () -> Unit/* crossline will stop returning local scope */) {
    println("Raj is King ${a + b}")
    block()
}