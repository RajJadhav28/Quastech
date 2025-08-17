package Polymorphism;

class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	double add(double a,double b ) {
		return a+b;
	}
}
public class Pro1 {
	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		System.out.println("Sum of digits:"+obj.add(10, 20));
		System.out.println("Sum of digits:"+obj.add(20.0, 10.28));
		
	}
}
