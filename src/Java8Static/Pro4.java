package Java8Static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
	private int id;
	private String name;
	private int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
public class Pro4 {
	public static int compareByname(Student a, Student b) {
		return a.getName().compareTo(b.getName());
	}
	public static int compareByid(Student a, Student b) {
		return a.getId()-b.getId();
	}
	public static void main(String[] args) {
		List<Student> list=new ArrayList();
		list.add(new Student(1, "sam", 24));
		list.add(new Student(2, "ram", 25));
		list.add(new Student(3, "Nill", 26));
		System.out.println("Compare by name:");
		Collections.sort(list, Pro4::compareByname);
		list.forEach(System.out::println);
		System.out.println("Compare by id:");
		Collections.sort(list,Pro4::compareByid);
		list.forEach(System.out::println);
		System.out.println("Using lambda expression:");
		 Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));
		 list.forEach(System.out::println);
	}
}
