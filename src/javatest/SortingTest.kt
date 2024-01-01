package javatest


object SortingTest {
    @JvmStatic
    fun main(args: Array<String>) {
//        println("Please Enter number")
//        val n=Scanner(System.`in`).nextInt()
//        val array = Array(n) { IntArray(n) }
//        array[0][0]=5
//        for (i in array.indices) {
//            for (j in array.indices) {
//                print(" ${array[i][j]}")
//            }
//            println()
//        }
        val arr = intArrayOf(12, 11, 13, 5, 6, 7, 12)
      for (i in 1 until arr.size){
          val key=arr[i]
          var j=i-1
          while (j>=0 && key<arr[j]){
              arr[j+1] = arr[j]
              j--
          }
          arr[j+1] = key
      }
      println(arr.contentToString())
    }



}
