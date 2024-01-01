package turingjava;

public class Test3 implements Runnable {

    @Override
    public void run() {
        System.out.print("Turing");
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1= new Thread(new Test3());
        t1.start();
        t1.start();
        System.out.println(t1.getState());
    }
}
