package Interfaces;

import java.io.Serializable;

class Employee implements Serializable{
	private String name;
    private int id;
    private transient double salary; // 'transient' means won't be serialized
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
    
    
}
public class Serilization_InterfaceClass {
	

}
