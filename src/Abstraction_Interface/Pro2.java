package Abstraction_Interface;

abstract class Bank{
	abstract int getRateOfInterest();
}
class SBI extends Bank{
	int getRateOfInterest() {
		return 10;
	}
}
class PNB extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
public class Pro2 {
	public static void main(String[] args) {
		SBI obj=new SBI();
		PNB obj2=new PNB();
		System.out.println("Rate of Interest of SBI:"+obj.getRateOfInterest());
		System.out.println("Rate of INterest of PNB:"+obj2.getRateOfInterest());
	}
}
