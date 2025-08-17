package AccessModifiers;
//the access level of a private modifier is only within the class. It cannot be accessed from outside the class.
class A{
	private int data=40;
	private void msg() {
		System.out.println("hello java");
	}
}
public class Pro3 {
	public static void main(String[] args) {
		A obj=new A();
//		obj.msg();//compile time error
//		System.out.println(obj.data);//compile time error
	}
}
