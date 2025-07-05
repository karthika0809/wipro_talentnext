package java_fundamentals;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 elements for array A:");
        for (int i = 0; i < 3; i++) a[i] = in.nextInt();

        System.out.println("Enter 3 elements for array B:");
        for (int i = 0; i < 3; i++) b[i] = in.nextInt();

        int[] result = {a[1], b[1]};
        System.out.println("Middle elements: " + result[0] + ", " + result[1]);
        in.close();
    }
}

