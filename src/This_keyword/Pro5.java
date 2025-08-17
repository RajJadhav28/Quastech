package This_keyword;

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
		Student3 obj=new Student3(101, "Raj", "Java",10.5f);
		obj.display();
	}
}
