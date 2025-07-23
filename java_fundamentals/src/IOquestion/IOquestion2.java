package IOquestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOquestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input file name
        System.out.println("Enter the input file name");
        String inputFile = scanner.nextLine();
        
        // Get output file name
        System.out.println("Enter the output file name");
        String outputFile = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
