package InstanceInitializerBlock;

class A12{
	A12(){
		System.out.println("Parent class constructor invoked!!!");
	}
}
class B12 extends A12{
	B12(){
		//super();
		
		System.out.println("Child class constructor invoked.");
	}
	{System.out.println("instance initializer Block");}
}

public class Pro1 {
	public static void main(String[] args) {
		B12 b=new B12();
	}
}
		//In the above example, it seems that instance initializer block is firstly invoked but NO.
		//Instance initializer block is invoked at the time of object creation. 
		//The Java compiler copies the instance initializer block in the constructor after the first statement super().
		//So firstly, constructor is invoked.
		//It doesn't matter super() keyword is written or not super keyword is always there in a constructor, first it will 
		