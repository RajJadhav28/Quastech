package Set1;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int id;
	String name; int rollno;
	
	public Employee(int id, String name, int rollno) {
		this.id=id;
		this.name=name;
		this.rollno=rollno;
	}
	
	public int compareTo(Employee e) {
		if(e.id>id) {
			return 1;
		}else if(e.id<id) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class Pro5 {
	public static void main(String[] args) {
		Set<Employee> set=new TreeSet<Employee>();
//		Employee emp=new Employee(101, "Raj", 1);
//		Employee emp2=new Employee(102, "Jay", 2);
//		Employee emp3=new Employee(103, "Rahul", 3);
//		set.add(emp);
//		set.add(emp2);
//		set.add(emp3);
		
		set.add(new Employee(101, "Raj", 1));
		set.add(new Employee(102, "Jay", 2));
		set.add(new Employee(103, "Rahul",3));
		
		set.forEach(a->{
			System.out.println(a.id+" "+a.name+" "+a.rollno);
		});
	}
}
