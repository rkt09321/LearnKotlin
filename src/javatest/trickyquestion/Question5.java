package javatest.trickyquestion;

public class Question5 {
    public static void main(String[] args) {
     //new Print().printValue(null);
    }
}

class Print{
    public void printValue(String str){
        System.out.println("String");
    }
    public void printValue(StringBuffer str){
        System.out.println("StringBuffer");
    }
    public void printValue(Object obj) {
        System.out.println("Object");
    }
}
