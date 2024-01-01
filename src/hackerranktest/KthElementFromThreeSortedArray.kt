package hackerranktest

/**
 * Given three sorted arrays A, B, and C. Write the most efficient algorithm to find the 5th largest element among the three arrays.
Input : NA
Output : NA
 */
fun main(array: Array<String>) {
    val arr1= intArrayOf(1,2,4,8,9,14,23,34)
    val arr2= intArrayOf(2,3,7,8,9,45,67,76)
    val arr3 = intArrayOf(5,6,7,45,68,97,99)
    val kth=10
    val sortedArray=IntArray(arr1.size+arr2.size+arr3.size)
    var i=0
    var j=0
    var k=0
    for (l in sortedArray.indices){
            if (i<arr1.size && arr1[i] < arr2[j] && arr1[i] < arr3[k]) {
                sortedArray[l] = arr1[i]
                i++
            } else if (j<arr2.size && arr2[j] < arr3[k]) {
                sortedArray[l] = arr2[j]
                j++
            } else if(k<arr3.size){
                sortedArray[l] = arr3[k]
                k++
            }
    }
    println(sortedArray.contentToString())

    println(sortedArray[sortedArray.size-kth])
}