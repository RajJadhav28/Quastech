package This_keyword;
//The this() constructor call can be used to invoke the current class constructor.
//It is used to reuse the constructor. In other words, it is used for constructor chaining.
class A1{
	public char[] data;
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
		A1 obj=new A1(10);
	}
}
