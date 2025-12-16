package Queue2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student21{
	int rollno;
	String name, address;
	public Student21(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
}
class SortByRoll implements Comparator<Student21>{
	public int compare(Student21 a, Student21 b) {
		return a.rollno-b.rollno;
	}
}
class SortByName implements Comparator<Student21>{
	public int compare(Student21 a, Student21 b) {
		return a.name.compareTo(b.name);
	}
}
public class Comparator1 {
	public static void main(String[] args) {
		ArrayList<Student21> al=new ArrayList<Student21>();
		Student21 st=new Student21(1, "Rahul", "Mumbai");
		Student21 st1=new Student21(2,"Vijay","Thane");
		Student21 st2=new Student21(3,"Ajay","Raigad");
		al.add(st);
		al.add(st1);
		al.add(st2);
		System.out.println("Sort by rollno:");
		Collections.sort(al, new SortByRoll());
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.address);
		});
		System.out.println("===================");
		System.out.println("Sort by name:");
		Collections.sort(al, new SortByName());
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.address);
		});
		
	}
}
