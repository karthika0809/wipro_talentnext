package java_fundamentals;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] input = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        // Remove duplicates manually using full for loop
        int[] temp = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (input[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize] = input[i];
                newSize++;
            }
        }

        // Print the result
        System.out.print("Array after removing duplicates: {");
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i]);
            if (i < newSize - 1) System.out.print(", ");
        }
        System.out.println("}");

        scanner.close();
    }
}

