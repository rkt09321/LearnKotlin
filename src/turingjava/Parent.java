package turingjava;

public class Parent {
    {
        System.out.print("A");
    }
    static {
        System.out.print("B");
    }
}
class Childs extends Parent {
    {
        System.out.print("C");
    }
    static {
        System.out.print("D");
    }

    public static void main(String[] args) {
        Childs childs=new Childs();
    }
}
