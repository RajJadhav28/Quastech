package Set1;

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
class SortByname1 implements Comparator<Student>{
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}
class SortByRoll1 implements Comparator<Student>{
	public int compare(Student a, Student b) {
		if(a.rollno>b.rollno) {
			return 1;
		}else if(a.rollno<b.rollno) {
			return -1;
		}else {
			return 0;
		}
//		return a.rollno-b.rollno;
	}
}
public class Pro6 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student(222, "bbb", "london"));
		al.add(new Student(242, "aaa", "london"));
		al.add(new Student(121, "ccc", "london"));
		
		Collections.sort(al, new SortByname1());
		System.out.println("Sort by Name:");
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.address);
		});
		
		System.out.println("Sort by rollno:");
		Collections.sort(al, new SortByRoll1());
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.address);
		});
	}
}
