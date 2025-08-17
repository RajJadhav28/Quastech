package Inheritance;

class A{
	static {
		System.out.println("SIB-super");
	}
	public void run() {
		System.out.println("running");
	}
}
class B extends A{
	static int i=10;
	static {
		System.out.println("SIB-sub");
	}
}
public class Pro1 {
	public static void main(String[] args) {
		A obj11=new B();
		obj11.run();
		B obj=new B();
		obj.run();
		B obj1=(B) obj11;
		 obj1.run();
	}
}
