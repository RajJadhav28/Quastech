package Constructors;

class A2{
	A2(){
		this(5);
		System.out.println("Default constructor");
	}
	A2(int x){
		System.out.println(x);
	}
}
public class Pro4 {
	public static void main(String[] args) {
		A2 obj=new A2();
	}
}
