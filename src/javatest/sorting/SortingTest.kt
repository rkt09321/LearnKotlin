package javatest.sorting


object SortingTest {
    @JvmStatic
    fun main(args: Array<String>) {
        var array = intArrayOf(9, 14, 3, 2, 43, 11, 58, 22)
        println(array.contentToString())
        var tempArray = Array(array.size) { 0 }
        mergeSort(array, tempArray,0, array.size-1)
        println(array.contentToString())
    }

    private fun mergeSort(array: IntArray, tempArray: Array<Int>, low: Int, high: Int) {
        if (low < high) {
            val middle = (low + high) / 2
            mergeSort(array,tempArray,low,middle)
            mergeSort(array,tempArray,middle+1,high)
            mergeArrays(array,tempArray,low,middle,high)
        }
    }

    private fun mergeArrays(array: IntArray, tempArray: Array<Int>, low: Int, middle: Int, high: Int) {
        for (i in low..high){
            tempArray[i]=array[i]
        }
        var i=low
        var j=middle+1
        var k=low
        while (i<=middle && j<=high) {
            if (tempArray[i]<tempArray[j]){
                array[k]=tempArray[i]
                i++
            } else {
                array[k]=tempArray[j]
                j++
            }
            k++
        }
        while (i<=middle) {
            array[k]=tempArray[i]
            i++
            k++
        }
    }

    private fun spiralMatrix(array: Array<Array<Int>>) {
        var minRow = 0
        var maxRow = array.size - 1
        var minCol = 0
        var maxCol = array[0].size - 1
        var no = 1
        while (no <= array.size * array[0].size) {
            for (i in minCol..maxCol) {
                array[minRow][i] = no++
            }
            for (i in minRow + 1..maxRow) {
                array[i][maxCol] = no++
            }
            for (i in maxCol - 1 downTo minCol) {
                array[maxRow][i] = no++
            }
            for (i in maxRow - 1 downTo minRow + 1) {
                array[i][minCol] = no++
            }
            minRow++
            maxRow--
            minCol++
            maxCol--
        }
    }

}