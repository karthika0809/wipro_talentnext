package java_fundamentals;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) skip = true;
            if (!skip) sum += arr[i];
            if (arr[i] == 7 && skip) skip = false;
        }

        System.out.println("Sum: " + sum);
        in.close();
    }
}

