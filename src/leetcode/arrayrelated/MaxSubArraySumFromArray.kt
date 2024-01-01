package leetcode.arrayrelated

class MaxSubArraySumFromArray {
    var arry = intArrayOf(-2, -3, 4, -1,7,-5,90, -5, 1, 5, 3)
    fun maxSubArraySum(){
        println("Maximum contiguous sum is ")
        var max=Integer.MIN_VALUE
        var maxEnding=0
        for (i in arry.indices) {
            maxEnding+=arry[i]
            if(max<maxEnding)
                max=maxEnding
            if (maxEnding<0)
                maxEnding=0
        }  
        println(max)
    }

}

fun main() {
    MaxSubArraySumFromArray().maxSubArraySum()
}