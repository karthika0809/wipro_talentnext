package java_fundamentals;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) result[index++] = arr[i];
        }

        System.out.print("Result: ");
        for (int i = 0; i < n; i++) System.out.print(result[i] + " ");
        in.close();
    }
}

