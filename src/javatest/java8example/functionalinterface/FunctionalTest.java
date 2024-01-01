package javatest.java8example.functionalinterface;

import java.util.ArrayList;
import java.util.List;

public class FunctionalTest {
    public static void main(String[] args) {
       FunctionalInterfaceDemo demo= new Test()::printShow;
        demo.show(20,45);
        List list=new ArrayList();
        list.forEach(p->System.out.println(p));
        // OR

//        FunctionalInterfaceDemo demo= (a,b) -> System.out.println(a+b);
//        demo.show(10,5);
    }

}

class Test {
    public  void printShow(int a, int b) {
        System.out.println(a+b);
    }

}