package javatest.designpattern.testdesign.factory;

public class PC extends Computer{
    @Override
    String getComputerConfiguration() {
        return "PC";
    }

    @Override
    Computer getComputer() {
        return new PC();
    }
}
