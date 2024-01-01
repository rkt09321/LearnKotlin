package javatest.designpattern.creational.singleton;

import java.io.Serializable;

// https://www.journaldev.com/1827/java-design-patterns-example-tutorial
public class LazyInitializationSingleton implements Serializable,Cloneable {
    private volatile static LazyInitializationSingleton obj;

    private LazyInitializationSingleton() {
    }

    public static LazyInitializationSingleton getInstance() {
        if (obj == null) {
            // To make thread safe 
            synchronized (LazyInitializationSingleton.class) {
                // check again as multiple threads 
                // can reach above step 
                if (obj == null)
                    obj = new LazyInitializationSingleton();
            }
        }
        return obj;
    }

    // implement readResolve method
    protected Object readResolve() {
        return obj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return obj;
    }
}