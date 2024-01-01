package javatest.overriding;


import javatest.oopsconcept.overriding.Parent;

import java.io.IOException;

public class Child extends Parent {
		 public void show(int show) {
		   System.out.println("Child Show");
	   }
		 protected void getName() {
				
			}
	public static void main(String[] args) throws IOException {
		Child parent=new Child();
		//parent.show(4);
		//parent.getName();
		parent.show("Working");
	}
	public void show(String obj) throws IOException {
		System.out.println("Show String");
		
	}
}
