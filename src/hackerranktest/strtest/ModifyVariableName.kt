package hackerranktest.strtest

import java.util.*

fun main() {
    println("Enter String")
    val scanner=Scanner(System.`in`)
    val str=scanner.nextLine()
    var outputStr=""
    if(str.contains("_")){
        var i=0
        while (i<str.length){
            outputStr += if(str[i]=='_') {
                i++
                str[i].toString().toUpperCase()
            } else {
                str[i].toString()
            }
            i++
        }
    } else {
        var i=0
        while (i<str.length) {
            outputStr += if(str[i] in 'A'..'Z'){
                "_"+str[i].toString().toLowerCase()
            } else {
                str[i].toString()
            }
            i++
           }
        }
    println(outputStr)
}