package javatest.designpattern.testdesign.factorytest


fun main() {
    println(PCFactory.getComputer(ComputerType.SERVER).getConfiguration())
}