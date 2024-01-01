package javatest.threadtest.lock;
class add1 implements Runnable{
    int a,b; 
    int sum;
    public add1(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run() {
        add(a,b);
    }
    public void add(int a, int b){
       
        synchronized (this) {
            for(int i=a;i<=b;i++){
                sum = sum+ a;
                System.out.println("Name Of Thread "+this.getClass().getName());
            }
            System.out.println("Sum of "+a+" to "+ b+" numbers = "+sum);    
        }
    }
    public int getSum() {
    	return sum;
    }
}
class add2 implements Runnable{
    int a,b; 
    int sum;
    public add2(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run() {
        add(a,b);
    }
    public void add(int a, int b){
        
        synchronized (this) {
            for(int i=a;i<=b;i++){
                sum = sum+ a;
                System.out.println("Name Of Thread "+this.getClass().getName());
            }
            System.out.println("Sum of "+a+" to "+ b+" numbers = "+sum);    
        }
    }
    public int getSum() {
    	return sum;
    }
}
class add3 implements Runnable{
    int a,b;
    int sum;
    public add3(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run() {
        add(a,b);
    }
    public void add(int a, int b){
        
        synchronized (this) {
            for(int i=a;i<=b;i++){
                sum = sum+ a;
                System.out.println("Name Of Thread "+this.getClass().getName());
            }
            System.out.println("Sum of "+a+" to "+ b+" numbers = "+sum);    
        }
    }
    public int getSum() {
    	return sum;
    }
}
public class addnumbersusing5threads {
    public static void main(String[] args) {
    	add1 add1 = new add1(1,10);
    	add2 add2 =new add2(1,5);
    	add3 add3=new add3(5,10);
        Thread t1 = new Thread(add1);
        Thread t2 = new Thread(add2);
        Thread t3 = new Thread(add3);
        
        t1.start();
        t2.start();
        t3.start();
       try {
		t1.join();
		t2.join();
		t3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       System.out.println("Sum Main Are "+(add1.getSum()+add2.getSum()+add3.getSum()));
    }
}