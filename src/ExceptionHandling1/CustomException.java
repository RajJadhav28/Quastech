package ExceptionHandling1;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class CustomException {
	public  void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age not valid");
		}else {
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		CustomException obj=new CustomException();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		try {
			obj.validate(age);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
