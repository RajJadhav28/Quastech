package ExceptionHandling;

public class Pro6 {
	public static void main(String[] args) {
		try {
			int a[]=new int[10];
			a[5]=30/0;
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException occures");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occures");
		}catch(Exception e) {
			System.out.println("Parent exception occures");
		}
		System.out.println("Rest of the code");
	}
}
