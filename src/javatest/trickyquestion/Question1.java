package javatest.trickyquestion;

public class Question1 extends Object {
    public static void main(String[] args) {
     new A().print(null);
    }
}
class A{
    A() {
        System.out.println("A");
    }
    public void print(String str){
        System.out.println("String");
    }
    public void print(Object obj) {
        System.out.println("Object");
    }
}
