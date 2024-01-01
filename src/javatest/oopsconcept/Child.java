package javatest.oopsconcept;

public class Child extends Parent {
    final int i;
    public Child(String abc) {
        i = 20;
        System.out.println(i);
        System.out.println("Constructor Called");
    }
    static String name;

    void show() {

    }

    static {

    }

    {
        System.out.println("First");
    }

    {
        System.out.println("Second");
    }

    {
        System.out.println("Third");
    }

    public static void showMe() {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        final int i;
        i = 20;
        System.out.println(i);

        new Child("abc");
    }
}
