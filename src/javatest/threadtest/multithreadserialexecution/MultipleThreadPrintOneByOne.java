package javatest.threadtest.multithreadserialexecution;

public class MultipleThreadPrintOneByOne {
		 
		    public static void main(String[] args) {
		 
		        ResourceLock lock = new ResourceLock();
		 
		        ThreadA a=new ThreadA(lock);
		        ThreadB b=new ThreadB(lock);
		        ThreadC c=new ThreadC(lock);
		 
		        a.start();
		        b.start();
		        c.start();
		    }
}
