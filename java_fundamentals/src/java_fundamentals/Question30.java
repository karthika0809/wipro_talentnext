package java_fundamentals;

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        boolean only14 = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                only14 = false;
                break;
            }
        }

        System.out.println("Only 1 and 4? " + only14);
        in.close();
    }
}
