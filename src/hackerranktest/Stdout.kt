package hackerranktest

import java.util.*

internal object Stdout {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val st = sc.next()
        if (a in 0..10) println(a * 2)
        if (st.length in 1..15) println(st)
    }
}