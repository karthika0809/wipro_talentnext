package exceptions;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get array size
            System.out.println("Enter the number of elements in the array");
            int size = Integer.parseInt(scanner.nextLine());
            
            // Create array and input elements
            int[] array = new int[size];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }
            
            // Get index
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(scanner.nextLine());
            
            // Access and print element
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        } finally {
            scanner.close();
        }
    }
}