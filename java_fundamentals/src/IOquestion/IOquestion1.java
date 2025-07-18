package IOquestion;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOquestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get file name
        System.out.println("Enter the file name");
        String fileName = scanner.nextLine();
        
        // Get character to count
        System.out.println("Enter the character to be counted");
        char targetChar = scanner.nextLine().charAt(0);
        
        // Convert character to lowercase for case-insensitive counting
        char lowerTarget = Character.toLowerCase(targetChar);
        
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                // Convert each character to lowercase for comparison
                if (Character.toLowerCase((char) ch) == lowerTarget) {
                    count++;
                }
            }
            System.out.printf("File '%s' has %d instances of letter '%c'.%n", fileName, count, targetChar);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}