package kotlintest.mettletest

fun main() {
   generateSequence(0) {
       it*2
   }.take(10).forEach {
       if(it%2==0){
           return
       }
       println("$it ")
   }
}