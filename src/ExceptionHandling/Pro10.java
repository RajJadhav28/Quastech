package ExceptionHandling;

public class Pro10 {
	public static void main(String[] args) {
		try {
			int data=50/0;
			System.out.println(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block is executed whether ");
		}
		System.out.println("rest of the code.");
	}
}
