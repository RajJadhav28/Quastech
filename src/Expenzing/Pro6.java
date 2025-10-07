package Expenzing;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int empId;
	String empName;
	int empSal;
	
	Employee(int empId, String empName, int empSal){
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
//	public void display() {
//		System.out.println(empId+" "+empName+" "+empSal);
//	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
}
public class Pro6 {
	public static void main(String[] args) {
		Map<Integer, Employee> map=new HashMap<Integer, Employee>();
		Employee emp=new Employee(101, "Raj", 10000);
		Employee emp1=new Employee(102, "Jay", 10000);
		Employee emp2=new Employee(103, "Yuvraj", 10000);
		
		map.put(1, emp);
		map.put(2, emp1);
		map.put(3, emp2);
		
		for(Map.Entry<Integer, Employee> entry:map.entrySet()) {
			int key=entry.getKey();
			Employee e=entry.getValue();
			System.out.println(key+" Details:");
//			System.out.println(e.empId+" "+e.empName+" "+e.empSal);
//			e.display();
			System.out.println(e);
		}
		
	}
}
