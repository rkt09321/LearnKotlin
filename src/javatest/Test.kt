package javatest

fun main() {
    val kavita=User("Raj",28)
    val julia=User("Raj",28)
    print(kavita.userName == julia.userName && kavita.age == julia.age)
}