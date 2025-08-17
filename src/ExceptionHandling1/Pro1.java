package ExceptionHandling1;

public class Pro1 {
	public static void main(String[] args) {
		try {
			int data=100/0;
			System.out.println(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Rest of the code");
	}
}
