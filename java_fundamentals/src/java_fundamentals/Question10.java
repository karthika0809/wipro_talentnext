package java_fundamentals;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a color code (R, B, G, O, Y, W):");
        String colorCode = scanner.nextLine().toUpperCase();

        String colorName;

        switch (colorCode) {
            case "R":
                colorName = "Red";
                break;
            case "B":
                colorName = "Blue";
                break;
            case "G":
                colorName = "Green";
                break;
            case "O":
                colorName = "Orange";
                break;
            case "Y":
                colorName = "Yellow";
                break;
            case "W":
                colorName = "White";
                break;
            default:
                colorName = "Invalid Code";
        }

        System.out.println(colorName);

        scanner.close();
    }
}