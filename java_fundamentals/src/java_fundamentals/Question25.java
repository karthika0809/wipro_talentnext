package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array using a full for loop
        System.out.println("Sorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        in.close();
    }
}

