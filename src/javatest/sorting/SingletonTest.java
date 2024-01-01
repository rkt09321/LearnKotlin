package javatest.sorting;

public class SingletonTest {
    public static final SingletonTest instance = new SingletonTest();

    private SingletonTest() {

    }


    public static SingletonTest getInstance() {
        return instance;
    }

    @Override
    protected Object clone() {
        return instance;
    }
}
