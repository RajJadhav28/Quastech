package ExceptionHandling;

public class Pro11 {
	public static void main(String[] args) {
		try {
			System.out.println("Inside try block.");
			int data=25/0;
			System.out.println(data);
		}catch(Exception e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always executed.");
		}
		System.out.println("Rest of the code");
		try {
			System.out.println("second try block");
			int a=20/0;
			System.out.println(a);
		}
		finally {
			System.out.println("second finally block.");
		}
	}
}
