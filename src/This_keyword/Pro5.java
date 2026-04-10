package This_keyword;

import java.util.Scanner;

class Student3{
	int rollno;
	String name, course;
	float fees;
	
	Student3(int rollno, String name, String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	Student3(int rollno, String name, String course, float fees){
		this(rollno, name, course);
		this.fees=fees;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+course+" "+fees);
	}
}
public class Pro5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rollno:");
		int rollno=sc.nextInt();
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the course:");
		String course=sc.next();
		System.out.println("Enter the fees:");
		float fees=sc.nextFloat();
		Student3 obj=new Student3(rollno, name, course, fees);
		obj.display();
		sc.close();
	}
}
