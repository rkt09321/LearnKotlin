package leetcode.arrayrelated

fun main() {
    val array= intArrayOf(4,3,4,-2,-5,3,1,6,7)
    println(canThreePartsEqualSum(array))
}

fun canThreePartsEqualSum(arr: IntArray): Boolean {
    var sum = arr.sum()
    //if not divided by 3 simply return false
    //if not divided by 3 simply return false
    if (sum % 3 != 0) {
        return false
    }

    val eachPart = sum / 3
    var eachPartSum = 0
    var count = 0
    for (element in arr) {
        eachPartSum += element
        if (eachPart == eachPartSum) {
            count++
            eachPartSum = 0
        }
    }
    return count >= 3
}