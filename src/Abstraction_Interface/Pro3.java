package Abstraction_Interface;

abstract class Bike{
	Bike(){
		System.out.println("Bike is created.");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed.");
	}
}
class honda extends Bike{
	void run() {
		System.out.println("Bike is running.");
	}
}
public class Pro3 {
	public static void main(String[] args) {
		honda obj=new honda();
		obj.run();
		obj.changeGear();
	}
}
