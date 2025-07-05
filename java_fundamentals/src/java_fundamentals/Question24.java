package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array (at least 4): ");
        int n = scanner.nextInt();

        if (n < 4) {
            System.out.println("Array must have at least 4 elements.");
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Display results
        System.out.println("Two smallest elements: " + arr[0] + ", " + arr[1]);
        System.out.println("Two largest elements: " + arr[n - 2] + ", " + arr[n - 1]);

        scanner.close();
    }
}
