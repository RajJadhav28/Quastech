package Encapsulation;

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
		obj.setName("Vijay");
		System.out.println(obj.getName());
	}
}
