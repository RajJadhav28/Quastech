package Expenzing;

abstract class Bank{
	abstract void getRateOfInterest();
	public void display() {
		System.out.println("Displaying");
	}
	Bank(){
		System.out.println("Banking domain");
	}
}
class ICICI extends Bank{
	public void getRateOfInterest() {
		System.out.println(5);
	}
}
public class Pro7 {
	public static void main(String[] args) {
	Bank obj=new ICICI();
	obj.display();
	obj.getRateOfInterest();
	}
}
