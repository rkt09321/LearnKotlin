package javatest.collection;

import java.util.TreeMap;

public class TreeSetTest {
  public static void main(String[] args) {
	TreeMap<String,String> map= new TreeMap<>();
	map.put("Raj", "Priya");
	map.put("Raj", "Annu");
	map.put("Radha", "Siya");
	map.put("Shyama", "Hanuman");
	map.put("Minku", "Neelam");
	System.out.println(""+ map);
	
}
}
