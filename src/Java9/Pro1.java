package Java9;

interface I2{
	default void add(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}
	private void add1(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}
	default void calladd1(int a, int b) {
		add1(a,b);
	}
}
class B implements I2{
	public void sub(int a, int b) {
		System.out.println("Subtraction:"+(a-b));
	}
}
public class Pro1 {
	public static void main(String[] args) {
		B obj=new B();
		obj.add(10, 20);
		obj.sub(20, 10);
		obj.calladd1(20, 5);//the way to call private method
	}
}
