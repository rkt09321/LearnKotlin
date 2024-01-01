package javatest.designpattern.testdesign.factory;

public class Test {
    public static void main(String[] args) {
        new ComputerFactory().getComputer(new PcFactory());
    }
}
