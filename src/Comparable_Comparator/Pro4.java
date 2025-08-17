package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{

	
	int rollno;
	String name;
	int age;
	
	public Student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student1 std) {
//		return age-o.age;
		if(rollno>std.rollno) {
			return 1;
		}else if(rollno<std.rollno){
			return -1;
		}else {
			return 0;
		}
	}

	
}
public class Pro4{
	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(new Student1(1, "Raj", 25));
		al.add(new Student1(2,"Jay",24));
		al.add(new Student1(3,"Pooja",24));
		Collections.sort(al);
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.age);
		});
	}
}
