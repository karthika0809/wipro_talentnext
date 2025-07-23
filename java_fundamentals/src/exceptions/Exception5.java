package exceptions;

//Custom exception for invalid age
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class Exception5 {
 public static void main(String[] args) {
     try {
         // Check if exactly 2 arguments are provided
         if (args.length != 2) {
             throw new IllegalArgumentException("Please provide name and age as arguments");
         }
         
         String name = args[0];
         int age = Integer.parseInt(args[1]);
         
         // Validate age
         if (age < 18 || age >= 60) {
             throw new InvalidAgeException("Age must be between 18 and 59");
         }
         
         // Display success message
         System.out.println("Name: " + name + ", Age: " + age + " - Valid input");
         
     } catch (NumberFormatException e) {
         System.err.println("Error: Age must be a valid integer");
         System.exit(1);
     } catch (InvalidAgeException e) {
         System.err.println("Error: " + e.getMessage());
         System.exit(1);
     } catch (IllegalArgumentException e) {
         System.err.println("Error: " + e.getMessage());
         System.exit(1);
     }
 }
}