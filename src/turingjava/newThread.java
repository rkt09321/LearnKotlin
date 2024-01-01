package turingjava;

public class newThread extends Thread{
    newThread() {
        super("My Thread");
        start();
    }
    public void run() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        new newThread();
    }
}
