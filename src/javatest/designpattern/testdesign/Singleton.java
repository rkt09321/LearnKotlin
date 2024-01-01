package javatest.designpattern.testdesign;

public class Singleton {
    private static Singleton INSTANCE;
    private Singleton() { }
    public static Singleton getInstance() {
        if(INSTANCE == null) {
            synchronized (Singleton.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
    public Object readResolve() {
       return  INSTANCE;
    }
    public Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }
}
