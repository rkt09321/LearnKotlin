package kotlintest

class StaticInitConstructorTest(val string: String) {
    private lateinit var str11:String
    init {
        println("Init Called $string")
    }

    constructor(str1: String, str2: String) : this(str1) {
        str11=str1
        println("From Second Constructor $str1 $str2")
    }

    fun show() {
        println("Init Called $string")
    }

    companion object {
        init {
            println("Init Called From Static")
        }
    }
}