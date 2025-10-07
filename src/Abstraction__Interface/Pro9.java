package Abstraction__Interface;

interface Showable11{
	void show();
	interface Message11{
		void msg();
	}
}
public class Pro9 implements Showable11.Message11{
	public void show() {
		System.out.println("Hello Interface");
	}
	public void msg() {
		System.out.println("Hello nested Interface");
	}
	public static void main(String[] args) {
		Showable11.Message11 obj=new Pro9();
		obj.msg();
		Pro9 obj1=new Pro9();
		obj1.show();
		obj1.msg();
	}
}
