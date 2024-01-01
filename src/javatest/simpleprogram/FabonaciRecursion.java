package javatest.simpleprogram;

public class FabonaciRecursion {
	public static void main(String[] args) {
		for(int i=0; i<=20; i++){
		System.out.print(fibonacci(i)+" ");
		}
	}
	public static int fibonacci(int n)  {
	    if (n < 2) return n;
	    return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
