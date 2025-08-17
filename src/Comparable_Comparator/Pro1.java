package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int empid, age;
	String name;
	public Employee(int empid, String name, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.age=age;
	}
//	public int compareTo(Employee emp) {
//		if(empid>emp.empid) {
//			return 1;
//		}else if(empid<emp.empid){
//			return -1;
//		}else {
//			return 0;
//		}
//	}
	
//	To print in Reverse order
//	public int compareTo(Employee emp) {
//		if(empid==emp.empid) {
//			return 0;
//		}else if(empid>emp.empid) {
//			return -1;
//		}else {
//			return 1;
//		}
//	}
	
//	Shortest way
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empid-o.empid;
	}
}
public class Pro1 {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee emp=new Employee(1, "Raj", 25);
		Employee emp2=new Employee(2, "Jay", 22);
		Employee emp3=new Employee(3, "Pooja", 21);
		
		al.add(emp);
		al.add(emp2);
		al.add(emp3);
		
//		second type to call
//		al.add(new Employee(1, "Raj", 25));
//		al.add(new Employee(2, "Jay", 22));
//		al.add(new Employee(3, "Pooja", 21));
		
		Collections.sort(al);
		al.forEach(a->{
			System.out.println(a.empid+" "+a.name+" "+a.age);
		});
		
	}
}
