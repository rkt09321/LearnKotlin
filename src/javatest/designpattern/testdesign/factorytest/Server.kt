package javatest.designpattern.testdesign.factorytest

class Server : Computer() {
    override fun getName(): String {
        return "HP Server"
    }

    override fun getVersion(): String {
        return "1.0"
    }

    override fun getConfiguration(): String {
        return "2 GB Ram 528 GB Hard Disk"
    }
}