package leetcode.arrayrelated

fun main() {
    val intArray=IntArray(5)
    intArray[0]=4
    intArray[1]=9
    intArray[2]=6
    intArray[3]=6
    intArray[4]=12
    val sumOfTwo=12
   sumofTwoValuePresentArray(intArray,sumOfTwo)

}

fun sumofTwoValuePresentArray(intArray: IntArray, sumOfTwo: Int) {
    for (i in 0 until intArray.size-1){
        for (j in i+1 until intArray.size){
            if(intArray[i]+intArray[j]==sumOfTwo){
                println("Sum present $i $j")
                return
            }
        }
    }
    println("Sum not present")
}
