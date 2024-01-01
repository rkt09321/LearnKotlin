package javatest.collection.collectioninterfaces;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private final int id;
    private final String name;
    private final int age;
    private final long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overriden to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
	}
    public static Comparator<Employee> idComparator=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.id-o2.id;
		}
	};
	public static Comparator<Employee> nameComparator=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.name.compareTo(o2.name);
		}
	};
	
	public static Comparator<Employee> ageComparator= Comparator.comparingInt(o -> o.age);
}

