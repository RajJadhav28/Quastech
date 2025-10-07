package Encapsulation2;

class Student{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class Pro1 {
	public static void main(String[] args) {
		Student obj=new Student();
		obj.setName("Raj");
		System.out.println(obj.getName());
	}
}
