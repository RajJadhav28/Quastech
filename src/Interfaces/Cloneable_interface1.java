package Interfaces;

class Address1 implements Cloneable{
	private String city;
	private String state;
	public Address1(String city, String state) {
		super();
		this.city=city;
		this.state=state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state=state;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}	
}
class Student1 implements Cloneable{
	private String name;
    private int age;
    private Address1 address;
	public Student1(String name, int age, Address1 address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student1 cloned=(Student1)super.clone();
		cloned.address=(Address1)address.clone();
		return cloned;
	}
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
	
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", address=" + address.getCity() + ","+ address.getState()+"]";
	}
	
}
public class Cloneable_interface1 {
	public static void main(String[] args) {
		try {
			Address1 addr=new Address1("NewYork", "Ny");
			Student1 original=new Student1("Alice", 20, addr);
			
			//clone the object
			Student1 cloned=(Student1) original.clone();
			
			//change the original object
			original.setName("Bob");
			original.getAddress().setCity("Boston");
			
			System.out.println("Original:"+original);
			System.out.println("Cloned:"+cloned);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
