package javatest.designpattern.structural.bridge;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Triangle extends Shape{
   ArrayList<String> al=null;
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
		List<Integer> temp = al.stream().map(x -> x.length()).collect(Collectors.toList());
	}

}
