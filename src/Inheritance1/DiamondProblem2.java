package Inheritance1;

interface DemoIntefrace11{
	//only abstract, default or static method permitted
	public  default void display() {
		System.out.println("the display() method of DemoIntefrace1 invoked.");
	}
}
interface DemoInterface22{
	public default void display() {
		System.out.println("the display() method of DemoIntefrace2 invoked.");
	}
}
public class DiamondProblem2 implements DemoIntefrace11, DemoInterface22{
	public void display() {
		DemoIntefrace11.super.display();
		DemoInterface22.super.display();
	}
	public static void main(String[] args) {
		DiamondProblem2 obj=new DiamondProblem2();
		obj.display();
	}
}
