package javatest.trickyquestion;

public class Question13 {
    public static void main(String[] args) {
        final class Constant {
            public final static String name="PI";
        }
        Thread thread=new Thread(() -> System.out.println(Constant.name)

        );
        thread.start();
    }
}

