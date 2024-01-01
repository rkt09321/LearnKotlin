package javatest.lock;
// Java program to illustrate yield() method 
// in Java 
import java.lang.*; 

// MyThread extending Thread 
class MyThread extends Thread 
{ 
	public void run() 
	{ 
		for (int i=0; i<5 ; i++) {
			// Control passes to other  thread of same process 
			Thread.yield(); 
			System.out.println(Thread.currentThread().getName() 
					+ " in control"); 

		} 
			
	} 
} 
class MyThread2 extends Thread 
{ 
	public void run() 
	{ 
		for (int i=0; i<5 ; i++) {
			System.out.println(Thread.currentThread().getName() 
					+ " in control"); 

		} 
			
	} 
}
// Driver Class 
public class yieldDemo 
{ 
	public static void main(String[]args) 
	{ 
		MyThread t = new MyThread(); 
		t.start(); 

		MyThread2 t2 = new MyThread2(); 
		t2.start();
		for (int i=0; i<5; i++) 
		{ 
			
			

			// After execution of child Thread 
			// kotlintest.trickyquestion.main thread takes over
			System.out.println(Thread.currentThread().getName() 
								+ " in control"); 
		} 
	} 
} 
