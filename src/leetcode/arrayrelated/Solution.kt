package leetcode.arrayrelated

class Solution {
    fun findMedianSortedArrays(num1: IntArray, num2: IntArray): Double {
      val tempArray= IntArray(num1.size+num2.size)
      var index1=0
      var index2=0
      for(i in tempArray.indices) {
          if(index1<num1.size && (num1[index1]<num2[index2])) {
            tempArray[i] = num1[index1]
              index1++
          } else if(index2<num2.size) {
             tempArray[i] = num2[index2]
              index2++
          }
      }
      if(tempArray.size%2==0) {
          val no=tempArray[tempArray.size/2-1]+tempArray[(tempArray.size/2)]
       return no.toDouble()/2 
      }
      return tempArray[(tempArray.size/2)+1].toDouble()
    }
}

fun main() {
    val array1=IntArray(2)
    array1[0]=1
    array1[1]=2

    val array2=IntArray(2)
    array2[0]=3
    array2[1]=4

    print(Solution().findMedianSortedArrays(array1,array2))
}