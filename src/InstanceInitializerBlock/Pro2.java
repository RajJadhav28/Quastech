package InstanceInitializerBlock;


class A{
	A(){
		System.out.println("Parent class constructor invoked!!!");
	}
}
class B extends A{
	B(){
		super();
		
		System.out.println("Child class constructor invoked.");
	}
	B(int a){
		super();
		System.out.println("child class constructor invoked:"+a);
	}
	{
		System.out.println("instance initializer block is invoked");
	}
}

public class Pro2 {
	public static void main(String[] args) {
		B obj=new  B();
		B obj1=new B(10);
	}
}
