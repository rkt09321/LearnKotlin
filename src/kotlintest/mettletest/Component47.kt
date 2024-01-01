package kotlintest.mettletest

open class Component47 {
    open fun click() {
       println("Clicking from component")
    }
}
abstract class Mouse : Component47() {
    abstract override fun click()
}
class Rat : Mouse (){
    override fun click() {
        println("Rat is clickable")
    }

}

fun main() {
    object : Mouse() {
        override fun click() {
            throw RuntimeException()
        }
    }.click()
}