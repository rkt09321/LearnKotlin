package turingjava;

public class Test2 {
    public static void main(String[] args) {
        SubClass s1=new SubClass();
        s1.foo();
        Super2 s2=new SubClass();
        //s2.foo();
    }
}
class Super2 {
   private void foo() {
       System.out.print("Super");
   }
}

class SubClass extends Super2 {
    public void foo() {
        System.out.print("Subclass");
    }
}
