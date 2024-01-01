package javatest.designpattern.creational.builder

class BuilderPKotlin(builder: Builder) {
    private var name = builder.name
    private var mobile = builder.mobile
    private var address = builder.address
    fun getName() = name
    override fun toString(): String {
        return "$name $mobile $address"
    }
    class Builder {
        var name: String? = null
        var mobile: String? = null
        var address: String? = null
        fun name(name: String) = apply {
            this.name = name
        }

        fun mobile(mobile: String) = apply {
            this.mobile = mobile
        }

        fun address(address: String) = apply {
            this.address = address
        }

        fun build() = BuilderPKotlin(this)
    }
}