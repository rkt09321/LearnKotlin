package javatest.removeduplicatefromlist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateObjectFromList {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Shivam", "Farmer", "13-02-2017"));
		employeeList.add(new Employee(2, "Shi", "Farmer", "13-02-2017"));
		employeeList.add(new Employee(3, "Shim", "Farmer", "13-02-2017"));
		employeeList.add(new Employee(5, "Svam", "Farmer", "13-02-2017"));
		employeeList.add(new Employee(9, "Sivam", "Fmer", "13-02-2017"));
		employeeList.add(new Employee(7, "Shivam", "Farmr", "13-02-2017"));
		employeeList.add(new Employee(2, "Shivam", "Faer", "13-02-2017"));
		employeeList.add(new Employee(9, "Shivam", "Farm", "13-02-2017"));
		employeeList.add(new Employee(1, "Shivam", "Farmer", "13-02-2017"));
		employeeList.add(new Employee(1, "Shivam", "Farmer", "13-02-2017"));
		employeeList.add(new Employee(9, "Shivam", "Farm", "13-02-2017"));
		employeeList.add(new Employee(9, "Shivam", "Farm", "13-02-2017"));
		employeeList.add(new Employee(9, "Sivam", "Fmer", "13-02-2017"));
		employeeList.add(new Employee(9, "Sivam", "Fmer", "13-02-2017"));
		employeeList.add(new Employee(5, "Siam", "Fmer", "13-02-2017"));
		employeeList.add(new Employee(5, "Siam", "Fmer", "13-02-2017"));
		System.out.println("ListSize Are  "+employeeList+"\n" + employeeList.size());
		removeDuplicate(employeeList);
		Set<Employee> set=new LinkedHashSet<Employee>();
		set.addAll(employeeList);
		System.out.println("ListSize Are  "+set+"\n" + employeeList.size());
	}

	private static void removeDuplicate(List<Employee> employeeList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < employeeList.size(); i++) {
			Employee employee = employeeList.get(i);
			for (int j = i + 1; j < employeeList.size(); j++) {
				Employee emp = employeeList.get(j);
				if (employee.getId() == emp.getId()
						&& employee.getName().equals(emp.getName())
						&& employee.getAddress().equals(emp.getAddress())
						&& employee.getDob().equals(emp.getDob())) {
					employeeList.remove(j);
					j--;
				}
			}
		}

	}

}
