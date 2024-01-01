package leetcode.arrayrelated

fun main(){
//    val arr= IntArray(6)
//    arr[0]=5
//    arr[1]=7
//    arr[2]=7
//    arr[3]=9
//    arr[4]=8
//    arr[5]=10
//
//    print(searchRange(arr,7).contentToString())
    multiply("23","56")
}

fun multiply(num1: String, num2: String): String {
    val number1=num1.toLong()
    val number2=num2.toLong()
    val number3=number1*number2
    return number3.toString()
}

//    fun searchRange(nums: IntArray, target: Int): IntArray {
//        val array=IntArray(2)
//        array[0]=-1
//        array[1]=-1
//        for(i in nums.indices){
//            if(nums[i]==target){
//                if(array[0]==-1) {
//                    array[0]=i
//                }else {
//                   array[1]=i
//                }
//            }
//        }
//        if(array[0]!=-1 && array[1]==-1) {
//           array[1]= array[0]
//        }
//       return array
//    }