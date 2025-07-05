package java_fundamentals;

public class Question33 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] arr = new int[3][3];
        int k = 0, max = Integer.MIN_VALUE;

        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) max = arr[i][j];
            }
            System.out.println();
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}
