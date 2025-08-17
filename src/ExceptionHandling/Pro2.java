package ExceptionHandling;

public class Pro2 {
	public static void main(String[] args) {
		int divident=10;
		int divisor=0;
		try {
			int result=divident/divisor;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
