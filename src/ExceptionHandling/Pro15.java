package ExceptionHandling;

class InvalidAgeException1 extends Exception{
	public InvalidAgeException1(String message) {
		super(message);
	}
}
public class Pro15 {
	 public static void validate(int age) throws InvalidAgeException1{
		 if(age<0) {
			 throw new InvalidAgeException1("Age cannot be negative.");
		 }
		 if(age<18) {
			 throw new InvalidAgeException1("Age must be at least 18");
		 }
		 System.out.println("Age is valid:"+age);
}
	 public static void processRegistration(int age) {
		 try {
			 validate(age);
			 System.out.println("Registration successfull");
		 }catch(InvalidAgeException1 e) {
			 System.out.println("Registration failed:"+e.getMessage());
		 }
	 }
	 public static void main(String[] args) {
		processRegistration(18);
	}
}
