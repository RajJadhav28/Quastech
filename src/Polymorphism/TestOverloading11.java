package Polymorphism;

class Adder1{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class TestOverloading11 {
	public static void main(String[] args) {
		Adder1 obj=new Adder1();
		System.out.println(obj.add(11, 11));
		System.out.println(obj.add(11, 11, 11));
	}
}
