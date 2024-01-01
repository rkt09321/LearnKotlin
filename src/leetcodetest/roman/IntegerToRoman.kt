package leetcodetest.roman

class IntegerToRoman {
    fun intToRoman(num: Int): String? {
        var num = num
        val roman = StringBuilder()
        val numbers = intArrayOf(1000, 900, 500, 400,  100, 90, 50, 40,  10,  9,  5,   4,  1)
        val romans =    arrayOf( "M" , "CM","D", "CD", "C","XC","L","XL","X","IX","V","IV","I")
        var previous = 0
        while (num > 0) {
            for (i in previous until numbers.size) {
                if (num >= numbers[i]) {
                    num -= numbers[i]
                    roman.append(romans[i])
                    previous = i
                    break
                }
            }
        }
        return roman.toString()
    }
    companion object {
        @JvmStatic
        fun main(args:Array<String>?) {
           print(IntegerToRoman().intToRoman(1863))
        }
    }

}