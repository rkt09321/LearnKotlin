package hackerranktest.strtest

import java.util.*

fun main() {
    var str="thisistest"
    println(str.count { it=='t' })
    val treeMap=TreeMap<Char,Int>()
    for (i in str.indices){
        if (treeMap.containsKey(str[i])){
            treeMap[str[i]] = treeMap[str[i]]!! +1
        } else {
            treeMap[str[i]] = 1
        }
    }
    str=""
    for ((key,value ) in treeMap){
        str+=key.toString()+value
    }
    println(str)
}