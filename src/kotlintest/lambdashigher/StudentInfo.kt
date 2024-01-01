class StudentInfo {
    infix fun address(block: AddressInfo.(String) -> Int) {
        val age: Int = block(AddressInfo(), "Rajani Kant Tiwari") // or it may call like this will passed internally
        // AddressInfo().let { block("Rajani Kant Tiwari")}
        AddressInfo().apply { }
        studentAge(age)

        val addressInfo = AddressInfo().myApply {
            postalAddress = "Maruti Nagar Colony"
            pinCode = 232102
        }
        println("${addressInfo.postalAddress} And ${addressInfo.pinCode}")
    }

    fun studentAge(age: Int) {
        print(age)
    }

    inline fun <T> T.my(block: T.() -> Unit): T {
        block()
        return this
    }

    fun lambdas(sum: (Int, Int) -> Int) {
        println("SumAre ${sum(90, 30)}")
    }

    fun higherOrder(sum: () -> Unit) {

    }
}