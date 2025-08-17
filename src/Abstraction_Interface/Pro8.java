package Abstraction_Interface;

interface Printable2{
	void print();
}
interface Showable2 extends Printable2{
	void show();
}
public class Pro8 implements Showable2{
	public void print() {
		System.out.println("Printing.");
	}
	public void show() {
		System.out.println("Showing.");
	}
	public static void main(String[] args) {
		Pro8 obj=new Pro8();
		obj.print();
		obj.show();
	}
}
