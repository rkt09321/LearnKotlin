package javatest.java8example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<User> myList = new ArrayList<>();
		for(int i=0; i<100; i++) {
			User user=new User();
			user.setName("name"+i);
			user.setMobileNumber("mobileNumber"+i);
			myList.add(user);
		} 
		
		//sequential stream
		Stream<User> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<User> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<User> highNums = parallelStream.filter(p -> p.getName().contains("9"));
		
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p.getName()+" "+p.getMobileNumber()));
		
		Stream<User> highNumsSeq = sequentialStream.filter(p -> p.getName().contains("9"));
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p.getName()+" "+p.getMobileNumber()));

	}

}
