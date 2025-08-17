package Static;

class Student{
	int rollno;
	String name;
	static String college="ITS";
	
	Student(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class Pro1 {
	public static void main(String[] args) {
		Student obj=new Student(111, "Karan");
		Student obj1=new Student(222, "Arjun");
		obj.display();
		obj1.display();
	}
}
