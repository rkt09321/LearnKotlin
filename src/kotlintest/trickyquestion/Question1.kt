package kotlintest.trickyquestion

class Question1 {

}

fun main(args : Array<String>){
   println((1..100).map {
       index-> mapOf(0 to index, index%3 to "Fizz",index%5 to "Buzz", index%15 to "Fizz Buzz")[0]
   })
}