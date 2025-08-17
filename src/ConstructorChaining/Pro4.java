package ConstructorChaining;

class Base1{
	String name;
	Base1(){
		this("");
		System.out.println("Default constructor");
	}
	Base1(String name){
		this.name=name;
		System.out.println("Calling Paramaterized");
	}
}
public class Pro4 extends Base1{
	Pro4(){
		System.out.println("Default constructor child.");
	}
	Pro4(String name){
		super(name);
		System.out.println("Paramaterized");
	}
	public static void main(String[] args) {
		Pro4 obj=new Pro4();
	}
}
