package leetcode.simple

import java.lang.StringBuilder

class RomanToIntegerTest {
    companion object {
        @JvmStatic
        fun main(array: Array<String>) {
            println(RomanToIntegerTest().intToRoman(16156))
        }
    }

    private fun intToRoman(num: Int): String {
        var number=num
        val romanNumber=StringBuilder()
        val array= intArrayOf(1000,900,500,400,100,90,50,40,10,9,5,4,1)
        val romanArray= arrayOf("M","DM","D","CD","C","XC","L","XL","X","IX","V","IV","I")
        var previous=0
        while (number>0) {
            for (i in previous until array.size) {
                if(number>=array[i]) {
                    number-=array[i]
                    romanNumber.append(romanArray[i])
                    previous=i
                    break
                }
            }
        }

        return romanNumber.toString()
    }

}