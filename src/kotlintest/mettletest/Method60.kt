package kotlintest.mettletest

    fun method(a: Int) {
        when (false) {
            (a % 2 == 0) -> print("Option1")
            (a in 1..3) -> print("Option3")
            else -> print("Else Branch")
        }
    }

fun main() {
   method(3)
}