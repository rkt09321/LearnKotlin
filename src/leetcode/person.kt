package leetcode

fun person(block: Person.() -> Unit): Person = Person().apply(block)

data class Person(var name: String? = null,
                  var age: Int? = null)