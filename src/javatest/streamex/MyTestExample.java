package javatest.streamex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyTestExample  {
	
    static class FunctionInt implements Consumer<Integer>{

		@Override
		public void accept(Integer t) {
			System.out.println("Number   "+t);
			
		}
    }
 public static void main(String[] args) {
	 List<Integer> list=new ArrayList<>();
	 for(int i=0;i<10;i++) {
		 list.add(i);
	 }
	 list.forEach(new FunctionInt());
}
}
