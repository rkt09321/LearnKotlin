package hackerranktest.strtest

fun main() {
    val array= arrayOf(1,2,1,5,7,1,6,1,1)
    val hashMap=HashMap<Int,Int>()
    for (i in array.indices) {
        if(hashMap.containsKey(array[i])){
            hashMap[array[i]] = hashMap[array[i]]!!+1
        } else {
            hashMap[array[i]] = 1
        }
    }
    if(hashMap.values.sortedBy { it }[hashMap.size-1] >array.size/2){
        println(1)
    }else {
        println(-1)
    }
}