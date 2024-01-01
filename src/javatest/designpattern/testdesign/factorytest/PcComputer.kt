package javatest.designpattern.testdesign.factorytest

class PcComputer: Computer() {
    override fun getName(): String {
        return "HP Server"
    }

    override fun getVersion(): String {
        return "2.0"
    }

    override fun getConfiguration(): String {
        return "20 GB Ram 5 TB Hard Disk"
    }
}