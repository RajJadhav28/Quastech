package Abstraction__Interface;

abstract class Bank{
	abstract int getrateOfInterest();
}
class SBI extends Bank{
	public int getrateOfInterest() {
		return 10;
	}
}
class ICICI extends Bank{
	public int getrateOfInterest() {
		return 7;
	}
}
public class Pro3 {
	public static void main(String[] args) {
		Bank obj=new SBI();
		Bank obj1=new ICICI();
		
		System.out.println("rateOfInterest SBI 	:"+obj.getrateOfInterest());
		System.out.println("rateOfInterest ICICI 	:"+obj1.getrateOfInterest());
	}
}
