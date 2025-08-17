package Java8;

interface A21{
	public void show();
}
public class Pro9 {
	public static void main(String[] args) {
		A21 obj=()->{
			System.out.println("I am show method");
		};
		obj.show();
	}
}
