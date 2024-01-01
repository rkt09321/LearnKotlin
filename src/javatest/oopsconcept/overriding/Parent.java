package javatest.oopsconcept.overriding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Parent implements First,Second{
    void show(int show) {
	   System.out.println("Parent Show");
   }
    @SuppressWarnings("unused")
	private void getName() {
		System.out.println("Show");
		Collections.synchronizedList(null);
		LinkedList<String> list;
		Stack<String> stack;
	}
	@Override
	public void show() throws ArithmeticException {
	System.out.println(First.x);
		
	}
	public void show(String obj) throws Exception {
		System.out.println("Show Obj");
		
	}
}
