package Constructors;
//this is used to invoke current class instance variable
class Student{
	 int rollno;
	 String name;
	 float fee;
	 
	 Student(int rollno, String name, float fee){
		 this.rollno=rollno;
		 this.name=name;
		 this.fee=fee;
		 }
	 void display() {
		 System.out.println(rollno+" "+name+" "+fee);
	 }
}
public class Pro1 {
	public static void main(String[] args) {
		Student s1=new Student(111, "Ankit", 10000);
		s1.display();
	}
}
