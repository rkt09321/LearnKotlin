package kotlintest

class MapTest {
  var list= listOf<Int>(3,5,4,67,3,2,7,1,9,23,54)
    var filteredList=list.filter { it>10 }.map { it*it }
    val myLambda={num:Int->num>30}
    fun testAllFun(){
        println(filteredList)
        println(list.all (myLambda))
        println(list.any (myLambda))
        println(list.count (myLambda))
        println(list.find (myLambda))
    }
}