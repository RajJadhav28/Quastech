package Abstraction_Interface;

interface Drawable2{
	void draw();
	default void msg() {
		System.out.println("default method");
	}
	static int cube(int x) {
		return x*x*x;
	}
}
class Rectangle2 implements Drawable2{
	public void draw() {
		System.out.println("Drawing...");
	}
}
public class Pro9 {
	public static void main(String[] args) {
	Drawable2 obj=new Rectangle2();
	obj.draw();
	obj.msg();
	System.out.println(Drawable2.cube(5));
	}
}
