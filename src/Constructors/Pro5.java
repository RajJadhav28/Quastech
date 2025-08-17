package Constructors;

class Base{
	String name;
	Base(){
		this("");
		System.out.println("No-argument constructor of base class");
	}
	Base(String name){
		this.name=name;
		System.out.println("Calling Paramaterized constructor1.");
	}
}
public class Pro5 extends Base{
	Pro5(){
		System.out.println("No-argument constructor of derived.");
	}
	Pro5(String name){
		super(name);
		System.out.println("Calling Paramaterized constructor2.");
	}
	public static void main(String[] args) {
		//Pro5 obj=new Pro5("test");
		Pro5 obj1=new Pro5();
		
	}
}
