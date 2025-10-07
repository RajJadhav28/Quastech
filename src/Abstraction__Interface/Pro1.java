package Abstraction__Interface;

abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	public void run() {
		System.out.println("Bike is running...");
	}
}
public class Pro1 {
	public static void main(String[] args) {
		Honda obj=new Honda();
		obj.run();
	}

}
