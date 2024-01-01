package hackerranktest
// https://www.hackerearth.com/practice/problems/?limit=20&offset=0
import java.util.*

fun main(args : Array<String>){
//    val scanner=Scanner(System.`in`)
//    val number=Integer.parseInt(scanner.nextLine())
//    val originalStr = scanner.nextLine()
//    val splitStr = originalStr.split(" ")
//    for (i in 0 until number){
//        val numbers=Integer.parseInt(splitStr[i])

       print( (1..200).map { index-> mapOf(0 to index,index%3 to "Fizz",index%5 to "Buzz",index%15 to "FizzBuzz")[0] })
//        for (j in 1..Integer.parseInt(splitStr[i])) {
//            if(j%3==0 && j%5==0){
//                println("FizzBuzz")
//            }else if(j%3==0) {
//                println("Fizz")
//            }else if(j%5==0) {
//                println("Buzz")
//            }else{
//                println(j)
//            }
//        }
 //   }
}