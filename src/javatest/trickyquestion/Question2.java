package javatest.trickyquestion;

public class Question2 {
    public static void main(String[] args) {
        C c = new C("");
    }

}
class B extends A {
    B() {
        System.out.println("B");
    }
}
class C extends B {
    C(String s) {
        System.out.println("C");
    }
}
