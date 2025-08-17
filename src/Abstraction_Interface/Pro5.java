package Abstraction_Interface;

interface Printable{
	void print();
}
class Printer implements Printable{
	public void print() {
		System.out.println("Printing");
	}
}
public class Pro5 {
	public static void main(String[] args) {
		Printer obj=new Printer();
		obj.print();
	}
}
