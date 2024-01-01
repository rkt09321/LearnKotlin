package javatest.designpattern.testdesign.factorytest

class PCFactory {
    companion object {
        fun getComputer(type: ComputerType): Computer {
            return when (type) {
                ComputerType.PC -> PcComputer()
                ComputerType.SERVER -> Server()
            }
        }
    }
}