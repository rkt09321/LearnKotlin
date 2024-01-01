package javatest.designpattern.testdesign.factory;

public class Server extends Computer{
    @Override
    String getComputerConfiguration() {
        return "Server";
    }

    @Override
    Computer getComputer() {
        return new Server();
    }
}
