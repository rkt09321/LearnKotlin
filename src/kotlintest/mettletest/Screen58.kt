package kotlintest.mettletest

open class Screen58 {
    open fun display() {
        println("This is the display")
    }
}

class WideScreen : Screen58() {
    override fun display() {
        println("This is the wide screen display")
    }
}

fun main(args: Array<String>) {
    val wideScreen = WideScreen()
    wideScreen.display()
}