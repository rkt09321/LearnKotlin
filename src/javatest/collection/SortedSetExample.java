package javatest.collection;

import javatest.removeduplicatefromlist.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class SortedSetExample {
	public static void main(String[] args) {
		List<Employee> treeSet = new ArrayList<>();
		treeSet.listIterator();
		treeSet.add(new Employee(7, "hivam", "Farmr", "13-02-2017"));
		treeSet.add(new Employee(1, "hivam", "Farmer", "13-02-2017"));
		treeSet.add(new Employee(2, "Shi", "Farmer", "13-02-2017"));
		treeSet.add(new Employee(3, "him", "Farmer", "13-02-2017"));
		treeSet.add(new Employee(5, "Svam", "Far", "13-02-2017"));
		treeSet.add(new Employee(9, "Sivam", "Fmer", "13-02-2017"));
//	Stream<Employee> obj = treeSet.parallelStream().
//    filter(p -> p.getId()>5);
		List<Employee> collect = treeSet.parallelStream().filter(p -> p.getName().startsWith("S"))
				// .map(Employee::getAddress)
				.collect(Collectors.toList());
		//System.out.println("TreeSet " + collect.toString());
		//collect.forEach(System.out::println);
		
		Employee result = treeSet.stream()				   // Convert to steam
				.filter(x -> "hivam".equals(x.getName()))	// we want "michael" only
				.findAny()									// If 'findAny' then return found
				.orElse(null);
		System.out.println(" "+result);
		
		Map<Integer,String> map=new HashMap<>();
		map.put(10, "Ram");
		map.put(10, "Shyam");
		System.out.println("Map "+map.toString());
		
		Employee res = treeSet.stream()				   // Convert to steam
				.filter(x ->"hivam".equals(x.getName())&&"Farmr".equals(x.getAddress()))	// we want "michael" only
				.findAny()									// If 'findAny' then return found
				.orElse(null);
	
		
	}
}
