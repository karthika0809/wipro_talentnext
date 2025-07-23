package collectiion;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

// Program to print prime numbers from ArrayList using lambda
public class Collection18 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100)); // Random numbers from 0 to 99
        }
        
        System.out.println("Original ArrayList: " + al);
        
        // Filter prime numbers using lambda
        Predicate<Integer> isPrimePredicate = n -> isPrime(n);
        System.out.println("Prime Numbers:");
        al.stream().filter(isPrimePredicate).forEach(System.out::println);
    }
}
