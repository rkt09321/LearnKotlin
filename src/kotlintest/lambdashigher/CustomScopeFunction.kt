public inline fun <T> T.myApply(block: T.() -> Unit): T {
    block()
return this
}