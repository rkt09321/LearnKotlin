package hackerranktest
/*Find the count of prime numbers between l and r where 1 <= l, r <= 10 ^ 9 and those numbers whose digits are not even numbers and digits are less than 5

Eg :- l = 1
r = 10
Input : NA


Output : NA
 */
fun main(array: Array<String>) {
    var count=0
    val l=1
    val r=50
    for (i in l..r) {
        var isPrime=true
        for (j in 2..(i / 2)) {
            if(i%j==0){
                isPrime=false
                break
            }
        }
        if(isPrime && i>1){
            count+=1
        }
    }
    println(count)
}