package Polymorphism;

class Bike{
	void run() {
		System.out.println("Bike is running.");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("Splendor running with safely with 60km/hr");
	}
}
public class Pro2 {
	public static void main(String[] args) {
		Bike obj=new Splendor();//upcasting:-f the reference variable of Parent class refers to the object of Child class, it is known as upcasting.
		obj.run();
	}
}
