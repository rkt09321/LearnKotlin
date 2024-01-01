package javatest.designpattern.testdesign.factory;

public class ComputerFactory {
    public Computer getComputer(ComputerAbstractFactory abstractFactory) {
       return abstractFactory.createComputer();
    }
}
