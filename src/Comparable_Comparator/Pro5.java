package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Student41{
	int rollno;
	String name, address;
	public Student41(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
}
	class SortByRoll1 implements Comparator<Student41>{
		public int compare(Student41 a, Student41 b) {
			return a.rollno-b.rollno;
		}
	}
		class SortByName1 implements Comparator<Student41>{
			public int compare(Student41 a, Student41 b) {
				return a.name.compareTo(b.name);
			}
		}
public class Pro5 {
	public static void main(String[] args) {
		ArrayList<Student41>al=new ArrayList<Student41>();
		al.add(new Student41(1, "Raj", "Kalyan"));
		al.add(new Student41(242, "aaa", "london"));
		al.add(new Student41(121, "ccc", "london"));
		
		Collections.sort(al, new SortByRoll1());
		for(Student41 st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.address);
		}
		Collections.sort(al, new SortByName1());
		for(Student41 st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.address);
		}
	}
}
