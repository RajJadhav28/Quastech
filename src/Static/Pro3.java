package Static;

class Student1{
	int rollno;
	String name;
	static String college="ITS";
	
	static void change() {
		college="BBDIT";
	}
	Student1(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}

	void display() {
		System.out.println("rollno:"+rollno+" name:"+name+" college:"+college);
	}
}
public class Pro3 {
	public static void main(String[] args) {
		Student1.change();
		Student1 s1 = new Student1(111,"Karan"); 
		s1.display();
	}
}
