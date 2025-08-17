package AccessModifiers;
//f you make any class constructor private, you cannot create an instance of that class from outside the class
 class B1{
	private B1() {
		System.out.println("Hello.");
	}
	void msg() {
		System.out.println("Hello Java.");
	}
}
public class Pro5 {
	public static void main(String[] args) {
//		B1 obj=new B1();--compile time error
	}
}
