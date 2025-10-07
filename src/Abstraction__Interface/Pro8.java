package Abstraction__Interface;

interface Drawable2{
	void draw();
	default void msg() {
		System.out.println("default message");
	}
	static int cube(int x) {
		return x*x*x;
	}
}
public class Pro8 implements Drawable2{
	public void draw() {
		System.out.println("Drawing...");
	}
	public static void main(String[] args) {
		Drawable2 obj=new Pro8();
		obj.msg();
		obj.draw();
		int cube=Drawable2.cube(3);
		System.out.println("Cube:"+cube);
	}
}
