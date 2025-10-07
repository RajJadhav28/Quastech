package Abstraction__Interface;

interface Printable{
	void print();
}
interface showable{
	void show();
}
public class Pro7 implements Printable, showable{
	public void  print() {
		System.out.println("printing...");
	}
	public void show() {
		System.out.println("showing...");
	}
	public static void main(String[] args) {
		Pro7 obj=new Pro7();
		obj.print();
		obj.show();
	}
}
