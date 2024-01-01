package hackerranktest
/*
Given an array of integers with repeating elements, find the sum of differences between positions of repeated elements and store them in an array of the same size.

For e.g. given array {1, 2, 3, 1, 2, 1, 2} we shall have:
For position 0: 1 is on positions 3&5 additional to position 0.
Thus for position 0: |3-0| + |5-0| = 8.
For position 1: 2 is on positions 4&6 additional to position 1.
Thus for position 1: |4-1| + |6-1| = 8.
Input : NA


Output : NA
 */
fun main(args:Array<String>) {
    val array= intArrayOf(1, 2, 3, 1, 2,3,1)
    val hashmap=HashMap<Int,Int>()
    for (i in array.indices) {
        val value=array[i]
        var count=0
        for (j in i+1 until array.size){
            if(hashmap.containsKey(value)) break
            if(value==array[j]){
               count+=j-i
            }
        }
        if(count!=0) {
            hashmap[value] = count
        }
    }
    for (hm in hashmap){
        println("${hm.key} ${hm.value}")
    }
}