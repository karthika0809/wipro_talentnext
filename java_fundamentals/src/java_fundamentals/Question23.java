package java_fundamentals;

import java.util.*;

public class Question23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask for the number of ASCII values
        System.out.print("Enter the number of characters: ");
        int n = in.nextInt();

        int[] asciiValues = new int[n];

        // Input ASCII values
        System.out.println("Enter " + n + " ASCII values:");
        for (int i = 0; i < asciiValues.length; i++) {
            asciiValues[i] = in.nextInt();
        }

        // Print corresponding characters
        System.out.print("Characters: ");
        for (int i = 0; i < asciiValues.length; i++) {
            System.out.print((char) asciiValues[i]);
        }

        System.out.println(); // Newline at the end
        in.close();
    }
}
