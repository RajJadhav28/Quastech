package Expenzing;

class Base{
	String name;
	Base(){
		this(5);
		System.out.println("Default constructor");
	}
	Base(int x){
		this(5,15);
		System.out.println("x:"+x);
		System.out.println("Parameterized constructor");
	}
	Base(int x,int y){
		System.out.println("z:"+(x*y));
	}
	Base(String name){
		this.name=name;
		System.out.println("Calling Parameterized");
	}
}
public class Pro4 extends Base{
	Pro4(){
		System.out.println("Default constructor");
	}
	Pro4(int x){
		super(15);
		System.out.println("Parameterized");
	}
	public static void main(String[] args) {
		Pro4 obj=new Pro4(5);
	}
}
