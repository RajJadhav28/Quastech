package ExceptionHandling;

public class Pro9 {
	public static void main(String[] args) {
		try {
			int data=25/5;
			System.out.println(data);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}
