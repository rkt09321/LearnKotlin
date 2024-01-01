package javatest.designpattern.testdesign.factory;

public class ServerFactory implements ComputerAbstractFactory{
    @Override
    public Computer createComputer() {
        return new Server();
    }
}
