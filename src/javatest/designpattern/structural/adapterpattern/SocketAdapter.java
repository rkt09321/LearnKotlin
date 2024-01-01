package javatest.designpattern.structural.adapterpattern;

public interface SocketAdapter {

	Volt get120Volt();
		
	Volt get12Volt();
	
	Volt get3Volt();
}
