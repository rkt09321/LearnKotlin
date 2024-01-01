package leetcode.stringrelated

import kotlin.collections.HashMap

fun main() {
    val originalStr="abcddiue rueriururueiuiddffdidddffffff"
    val hasMap=HashMap<Char,Int?>()
    val map=hasMap.toList().sortedByDescending { (_,value)-> value }.toMap()
    for(i in originalStr) {
        if(hasMap.containsKey(i)) {
            hasMap[i] = hasMap[i]?.plus(1)
        }else {
            hasMap[i]=1
        }
    }
    println()
    for ((key,value) in hasMap) {
        print(""+key+value)
    }
//    for (i in originalStr.indices) {
//        if(hasMap.containsKey(originalStr[i]))
//            hasMap[originalStr[i]] = hasMap[originalStr[i]]?.plus(1)
//        else
//            hasMap[originalStr[i]] = 1
//    }
//    hasMap.values.sortedBy {
//        it
//    }.let { arrayList->
//        if(arrayList[arrayList.size-1] ==arrayList[arrayList.size-2]){
//            println(0)
//        } else {
//            print(arrayList[arrayList.size-1])
//        }
//    }

}