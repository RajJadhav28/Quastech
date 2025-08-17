package Abstraction_Interface;

interface Printable1{
	void print();
}
interface Showable{
	void show();
}
class Computer implements Printable1, Showable{
	public void print() {
		System.out.println("Printing.");
	}
	public void show() {
		System.out.println("Showing.");
	}
}
public class Pro7 {
	public static void main(String[] args) {
		Computer obj=new Computer();
		obj.print();
		obj.show();
	}
}
