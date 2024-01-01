package javatest.stringtest;

public class OverrideTest {
    public static void main(String[] args) {
       B obj= new B();
       obj.i=1;
       obj.j=2;
       A r=obj;
       r.display();

    }
}
class A {
    int i;
    public void display() {
       System.out.println(i);
    }
}

class B extends A {
    int j;
    public void display() {
        System.out.println(j);
    }
}
