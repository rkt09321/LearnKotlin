package javatest.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Joe", 24),
                new Person("Pete", 18),
                new Person("Chris", 21)
        );
        Collections.sort(people, new NameComparator());
        System.out.println(people);
        Collections.sort(people, new AgeComparator());
        System.out.println(people);
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.name.compareToIgnoreCase(b.name);
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.age, b.age);
    }
}

class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
    public static void show() {
        System.out.println("Ram is going");
    }

    @Override
    public String toString() {
        return String.format("{name=%s, age=%d}", name, age);
    }
}