package Inheritance;

interface  Drawable{
	 void draw();
	  default void msg() {
		 System.out.println("default msg");
	 }
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing");
	}
}
public class Pro4 {
	public static void main(String[] args) {
		Drawable obj=new Rectangle();
		obj.draw();
		obj.msg();
	}
}
