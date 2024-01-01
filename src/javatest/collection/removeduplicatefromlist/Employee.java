package javatest.collection.removeduplicatefromlist;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String address;
	private String dob;
    public Employee() {
		

	}
	public Employee(int id, String name, String address, String dob) {
		this.setId(id);
		this.setName(name);
		this.setAddress(address);
		this.setDob(dob);
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDob() {
		return dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null||obj.getClass()!=getClass()) {
		return false;
		}else if(((Employee)obj).getId()==getId()&& ((Employee) obj).getName().equals(getName())
				&& ((Employee) obj).getDob().equals(getDob())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return id*7+name.length()+dob.length()*20;
	}
@Override
public String toString() {
	
	return id+name+address+dob;
}



@Override
public int compareTo(Employee o) {
	return this.id-o.id;
}
}
