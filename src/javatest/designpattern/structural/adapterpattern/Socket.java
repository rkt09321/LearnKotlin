package javatest.designpattern.structural.adapterpattern;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}
