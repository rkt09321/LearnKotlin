package hackerranktest

fun main(args : Array<String>) {
    val originalArray = arrayOf(2,5,3,7,8,9,20,4,7,6)
    quickSort(originalArray,0,originalArray.size-1)
    println(originalArray.contentToString())
}

fun quickSort(originalArray: Array<Int>, low: Int, high: Int) {
   val pivot=originalArray[(low+high)/2]
    var min=low
    var max=high
    while (min<=max){
        while (originalArray[min]<pivot)
            min++
        while (originalArray[max]>pivot)
            max--
        if(min<=max) {
           val temp=originalArray[min]
            originalArray[min]=originalArray[max]
            originalArray[max]=temp
            min++
            max--
        }
    }
    if(min<high){
        quickSort(originalArray,min,high)
    }
    if(low<max) {
        quickSort(originalArray,low,max)
    }
}
