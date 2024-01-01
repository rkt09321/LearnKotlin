package javatest.threadtest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadTesting {
   public static void main(String[] args) {
	   ExecutorService executor = Executors.newFixedThreadPool(10);
	   Future<Integer> future=executor.submit(new MyCallableThread(null));
	   
}
}
