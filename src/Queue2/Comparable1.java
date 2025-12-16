package Queue2;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student st) {
		if(age==st.age) {
			return 0;
		}else if(age>st.age) {
			return 1;
		}else {
			return -1;
		}
	}
}
public class Comparable1 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student st=new Student(1, "Raj", 25);
		Student st1=new Student(2, "Jay", 24);
		Student st2=new Student(3, "Suraj", 25);
		al.add(st);
		al.add(st1);
		al.add(st2);
		
		Collections.sort(al);
		al.forEach(a->{
			System.out.println(a.rollno+" "+a.name+" "+a.age);
		});
	}
}
