package javatest.designpattern.creational.singleton;
// https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/
public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton SINGLETON;
    private EagerInitializationSingleton() {}
    static {
        SINGLETON = new EagerInitializationSingleton();
    }

//    private static final EagerInitializationSingleton SINGLETON = new EagerInitializationSingleton();
//    public EagerInitializationSingleton getInstance() {
//      return SINGLETON;
//    }
}
