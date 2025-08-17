package ExceptionHandling1;

public class Pro2 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not elegiable to vote!!! ");
		}else {
			System.out.println("Elegiable to vote.");
		}
	}
	public static void main(String[] args) {
		validate(17);
		System.out.println("Rest of the code.");
	}
}
