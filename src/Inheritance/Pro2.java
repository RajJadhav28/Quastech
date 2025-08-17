package Inheritance;

class D{
	String company="Reliance";
	public void think() {
		System.out.println("I am DB Ambani, I think uniquely");
	}
}
public class Pro2 extends D{
	public static void main(String[] args) {
		Pro2 obj=new Pro2();
		obj.think();
		System.out.println(obj.company);
	}
}
