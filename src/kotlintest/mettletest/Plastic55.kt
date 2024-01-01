package kotlintest.mettletest

interface Plastic55 {
  fun melt() {
     println("Plastic Melting")
  }
    fun color()
}
interface Wood {
    fun melt()
}

class Material : Plastic55,Wood {
    override fun color() {
        println("My color is Brown")
    }

    override fun melt() {
        //super<Wood>.melt()
    }

}

