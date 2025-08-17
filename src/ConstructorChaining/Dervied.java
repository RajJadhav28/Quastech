package ConstructorChaining;

class Base{
	String name;
	Base(){
		this("");
		System.out.println("No argument constructor of base class");
	}
	Base(String name){
		this.name=name;
		System.out.println("Calling Parameterized constructor");
	}
}
public class Dervied extends Base{
	Dervied(){
		System.out.println("No-argument constructor.");
	}
	Dervied(String name){
		super(name);
		System.out.println("Calling Paramaterized constructor2");
	}
	public static void main(String[] args) {
		Dervied obj=new Dervied();
	}
}
