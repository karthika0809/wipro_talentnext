package collectiion;

import java.util.ArrayList;
import java.util.function.Supplier;

// Program to generate first 10 primes using Supplier
public class Collection35 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int count = 0;
            int num = 2;
            while (count < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                    count++;
                }
                num++;
            }
            return primes;
        };
        
        System.out.println("First 10 Prime Numbers: " + primeSupplier.get());
    }
}
