package Abstraction_Interface;

interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle.");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
public class Pro6 {
	public static void main(String[] args) {
		Drawable obj,obj1;
		obj=new Rectangle();
		obj1=new Circle();
		obj.draw();obj1.draw();
	}
}
