package javatest.trickyquestion.opps;

abstract class Derived
{
    public void getDetails(String temp) {
        System.out.println("Derived class " + temp);
    }
}
  
public class MethodOverriding extends Derived {
    // We can not change return type in method overriding
    public void getDetails(String temp)
    {
        System.out.println("Test class " + temp);
    }
    public static void main(String[] args)
    {
        MethodOverriding obj = new MethodOverriding();
        obj.getDetails("GFG");
    }
}