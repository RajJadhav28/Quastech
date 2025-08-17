package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int rollno;
	String name, address;
	
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
}
class SortByRoll implements Comparator<Student>{
	public int compare(Student a, Student b) {
		return a.rollno-b.rollno;
	}
}
class SortByname implements Comparator<Student>{
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}
public class Pro3 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student(222, "bbb", "london"));
		al.add(new Student(242, "aaa", "london"));
		al.add(new Student(121, "ccc", "london"));
		
		Collections.sort(al, new SortByname());
		System.out.println("Sort by Name:");
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.address);
		});
		System.out.println("Sort by rollno:");
		Collections.sort(al, new SortByRoll());
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.address);
		});
//		Second type
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
	}
}
