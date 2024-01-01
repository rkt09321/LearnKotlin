package javatest.designpattern.testdesign.factory;

public class PcFactory implements ComputerAbstractFactory{
    @Override
    public Computer createComputer() {
        return new PC();
    }
}
