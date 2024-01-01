package javatest.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StackTest {
public static void main(String[] args) {
	List<String> arrayList=new ArrayList<>();
	arrayList.add("A");
	arrayList.add("B");
	arrayList.add("C");
	arrayList.add("D");
	arrayList.add("E");
	new Thread(() -> {
		for(int i=0;i<1000;i++) {
			arrayList.add("abc");
		}

	}).start();
	Iterator iterator=arrayList.iterator();
	if(iterator.hasNext()) {
		Object value = iterator.next();
		iterator.remove();
		System.out.println(arrayList.toString());
	}
	System.out.println(" Return "+arrayList.size());
	System.out.println(" Return "+arrayList.hashCode());
}
}
