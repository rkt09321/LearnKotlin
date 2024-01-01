package javatest.designpattern.testdesign.observer;

public interface Subscriber {
    void register(MyObserver myObserver);
    void unRegister(MyObserver myObserver);
    void notifyObserver();
    Object getData();

}
