package javatest.streamex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StaffPublic {
	List<Integer> list=new ArrayList<>();
     class FunctionInt implements Consumer<Integer>{

		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub
			
		}
     }
    private String name;
    private int age;
    private String extra;
    //...
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
}