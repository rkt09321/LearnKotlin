package javatest.oopsconcept.overriding;


import java.io.IOException;

public class Child extends Parent {	
		 public void show(int show) {
		   System.out.println("Child Show");
	   }
		 protected void getName() {

			}
	public static final void main(String[] args) throws IOException {
		Child parent=new Child();
		//parent.show(4);
		//parent.getName();
		parent.show("Working");
	}
	public void show(String obj) throws IOException {
		System.out.println("Show String");
		
	}
}
