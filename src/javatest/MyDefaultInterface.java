package javatest;

public interface MyDefaultInterface {
    default void show(){
       System.out.println("Default Show is Working");
    }
}
