package exceptions;

//Custom exception class
class InvalidCountryException extends Exception {
 public InvalidCountryException() {
     super("User Outside India cannot be registered");
 }
 
 public InvalidCountryException(String message) {
     super(message);
 }
}

public class Exception4 {
 void registerUser(String username, String userCountry) throws InvalidCountryException {
     if (!userCountry.equalsIgnoreCase("India")) {
         throw new InvalidCountryException();
     }
     System.out.println("User registration done successfully");
 }
 
 public static void main(String[] args) {
     Exception4 registration = new Exception4();
     
     // Test case 1: Mickey, US
     try {
         registration.registerUser("Mickey", "US");
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }
     
     // Test case 2: Mini, India
     try {
         registration.registerUser("Mini", "India");
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }
 }
}