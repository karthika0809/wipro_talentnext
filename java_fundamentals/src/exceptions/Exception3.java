package exceptions;

import java.util.Scanner;

//Custom exception for negative values
class NegativeValueException extends Exception {
 public NegativeValueException(String message) {
     super(message);
 }
}

//Custom exception for out-of-range values
class OutOfRangeException extends Exception {
 public OutOfRangeException(String message) {
     super(message);
 }
}

public class Exception3 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     try {
         // Input for first student
         System.out.println("Enter name of first student:");
         String name1 = scanner.nextLine();
         System.out.println("Enter marks for 3 subjects:");
         int[] marks1 = new int[3];
         for (int i = 0; i < 3; i++) {
             int mark = Integer.parseInt(scanner.nextLine());
             if (mark < 0) {
                 throw new NegativeValueException("Marks cannot be negative");
             }
             if (mark < 0 || mark > 100) {
                 throw new OutOfRangeException("Marks must be between 0 and 100");
             }
             marks1[i] = mark;
         }
         
         // Input for second student
         System.out.println("Enter name of second student:");
         String name2 = scanner.nextLine();
         System.out.println("Enter marks for 3 subjects:");
         int[] marks2 = new int[3];
         for (int i = 0; i < 3; i++) {
             int mark = Integer.parseInt(scanner.nextLine());
             if (mark < 0) {
                 throw new NegativeValueException("Marks cannot be negative");
             }
             if (mark < 0 || mark > 100) {
                 throw new OutOfRangeException("Marks must be between 0 and 100");
             }
             marks2[i] = mark;
         }
         
         // Calculate and display averages
         double avg1 = (marks1[0] + marks1[1] + marks1[2]) / 3.0;
         double avg2 = (marks2[0] + marks2[1] + marks2[2]) / 3.0;
         System.out.printf("%s's average marks: %.2f%n", name1, avg1);
         System.out.printf("%s's average marks: %.2f%n", name2, avg2);
         
     } catch (NumberFormatException e) {
         System.err.println("Error: Marks must be valid integers");
     } catch (NegativeValueException e) {
         System.err.println("Error: " + e.getMessage());
     } catch (OutOfRangeException e) {
         System.err.println("Error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
