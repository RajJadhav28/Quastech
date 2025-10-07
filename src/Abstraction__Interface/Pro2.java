package Abstraction__Interface;

abstract class Shape{
	abstract void draw();
}
class circle extends Shape{
	public void draw() {
		System.out.println("Drawing circle...");
	}
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("drawing triangle...");
	}
}
public class Pro2 {
	public static void main(String[] args) {
		Shape obj=new Triangle();
		obj.draw();
	}
}
