package hackerranktest

/**
 * Given a string, say sentence=" this is crazy and fun" and a list, say name=["is", "fun"]. Now you need to capitalize on the first letter of every word in the given string which is not present in the list.
Input : this is crazy and fun
Output :
 */
fun main(array: Array<String>) {
    val givenStr=" this is crazy and fun"
    val array= arrayOf("is","fun")
    var capitalizeWord=""
    val givenStrArray=givenStr.split(" ")
    for (index in givenStrArray.indices){
        val str=givenStrArray[index]
        capitalizeWord += if(!array.contains(str))
            " "+givenStrArray[index].capitalize()
        else
            " "+givenStrArray[index]
    }
    println(capitalizeWord)
}