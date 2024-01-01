package javatest.java8example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String[] args) {
		
		//creating sample Collection
		List<User> myList = new ArrayList<>();
		for(int i=0; i<10; i++) {
			User user=new User();
			user.setName("name"+i);
			user.setMobileNumber("mobileNumber"+i);
			myList.add(user);
		} 
		
		//traversing using Iterator
		Iterator<User> it = myList.iterator();
		while(it.hasNext()){
			User i = it.next();
			System.out.println("Iterator Value::"+i.getName()+" "+i.getMobileNumber());
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<User>() {

			public void accept(User t) {
				System.out.println("forEach anonymous class:"+t.getName()+" "+t.getMobileNumber());
			}

		});
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<User>{

	public void accept(User t) {
		System.out.println("Consumer impl Value::"+t.getName()+" "+t.getMobileNumber());
	}


}
