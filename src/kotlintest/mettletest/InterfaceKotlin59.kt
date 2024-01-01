package kotlintest.mettletest

interface Java {
    fun compile() {
        println("Java is Compiling")
    }
}

interface Kotlin {
    fun compile() {
        println("Kotlin is Compiling")
    }
}

class Lang: Java,Kotlin {
    override fun compile() {
        super<Kotlin>.compile()
    }
}
fun main(args:Array<String>) {
    Lang().compile()
}