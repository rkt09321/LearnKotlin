package javatest.designpattern.structural.bridge;
// https://www.journaldev.com/1491/bridge-design-pattern-java

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
