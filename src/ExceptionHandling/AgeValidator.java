package ExceptionHandling;

//Custom checked exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class AgeValidator {
 
 // Method declaring that it throws InvalidAgeException
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 0) {
         throw new InvalidAgeException("Age cannot be negative");
     }
     if (age < 18) {
         throw new InvalidAgeException("Age must be at least 18");
     }
     System.out.println("Age is valid: " + age);
 }
 
 // Another method that calls validateAge() and handles the exception
 public static void processRegistration(int age) {
     try {
         validateAge(age);
         System.out.println("Registration successful!");
     } catch (InvalidAgeException e) {
         System.out.println("Registration failed: " + e.getMessage());
     }
 }
 
 // Main method that calls processRegistration()
 public static void main(String[] args) {
     processRegistration(18);  // Will fail
     processRegistration(20);  // Will succeed
     processRegistration(-5);  // Will fail
 }
}
