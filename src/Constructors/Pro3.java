package Constructors;
//this(): To Invoke the Current Class Constructor
//Calling Default Constructor From The Parameterized Constructor
class A1{
	A1(){
		System.out.println("hello a");
	}
	A1(int x){
		this();
		System.out.println(x);
	}
}
public class Pro3 {
	public static void main(String[] args) {
		A1 a=new A1(10);
	}
}
