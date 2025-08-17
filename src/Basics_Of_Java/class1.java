package Basics_Of_Java;

class Pro1{
	int a=10;
	public void m1() {
		System.out.println("Hello Java");
	}
	//return type method
	public int add1(int b, int c) {
		return b+c;
	}
	//no return type method
	public void add(int a, int d) {
		int result=a+d;
		System.out.println("result:"+result);
	}
}
public class class1 {
	//instance variable
	int a=20;
	public static void main(String[] args) {
		//local variable
		int a=10;
		Pro1 obj=new Pro1();
		System.out.println(obj.a);
		obj.m1();
		System.out.println("b+c:"+obj.add1(50,10));//add1 method output
		System.out.println(a);//local variable a
		class1 obj1= new class1();
		System.out.println(obj.a);//instance variable a
		obj.add(20, 20);//add method output
		
		

	}

}
