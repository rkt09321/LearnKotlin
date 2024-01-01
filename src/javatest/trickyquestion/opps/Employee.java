package javatest.trickyquestion.opps;

class Person {
    public Person() {
        System.out.println("Person class constructor called");
    }
}

public class Employee extends Person {

    static {
        System.out.println("Employee 1 called");
    }

    {
        System.out.println("Employee 2 called");
    }

    public Employee() {
        System.out.println("Employee class constructor called");
    }

    public static void main(String args[]) {
        Employee e = new Employee();
    }
} 