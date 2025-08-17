package Inheritance1;

class A{
	static {
		System.out.println("SBI-super");
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
public class Pro2 {
	public static void main(String[] args) {
		A obj1=new B();
		obj1.run();
//		B obj=new B();
//		obj.run();
		B obj2=(B)obj1;
		obj2.run();
	}
}
