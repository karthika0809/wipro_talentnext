package exceptions;

public class Exception2 {
    public static void main(String[] args) {
        try {
            // Check if exactly 5 arguments are provided
            if (args.length != 5) {
                throw new IllegalArgumentException("Exactly 5 integers are required");
            }
            
            // Create array from command-line arguments
            int[] numbers = new int[5];
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
            
            // Calculate sum
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            
            // Calculate average
            double average = sum / 5.0;
            
            // Display results
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            
        } catch (NumberFormatException e) {
            System.err.println("Error: All arguments must be valid integers");
        } catch (ArithmeticException e) {
            System.err.println("Error: Arithmetic error occurred - " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}