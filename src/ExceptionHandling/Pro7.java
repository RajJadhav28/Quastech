package ExceptionHandling;

public class Pro7 {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to be divided by zero.");
				int b=39/0;
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[]=new int[5];
				a[5]=4;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}catch(Exception e) {
			System.out.println("handled the exceptione (outer catch)");
		}
		System.out.println("normal flow");
	}
}
