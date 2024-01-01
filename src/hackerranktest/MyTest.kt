package hackerranktest

fun main(args:Array<String>){
    val str="This is a jhsjdhhds pattern"
    val pattern="pattern"

    print((1..200).map { index-> mapOf((0 to index),(index%3 to "Fizz"),(index%5 to "Buzz"),(index%15 to "FizzBuzz"))[0] })
    for (i in str.indices){
       var j=0
        var k=i
        while(j<pattern.length && str[k]==pattern[j]) {
           k++
           j++
            if(j==pattern.length){
                println("Found at Index ${i}")
            }
        }
    }

}