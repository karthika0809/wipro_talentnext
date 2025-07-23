package collectiion;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Program to filter perfect squares using Predicate
public class Collection32 {
    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(9);
        numbers.add(10);
        numbers.add(16);
        numbers.add(25);
        numbers.add(30);
        numbers.add(36);
        
        // Filter perfect squares
        Predicate<Integer> isPerfectSquare = Collection32::isPerfectSquare;
        ArrayList<Integer> squares = numbers.stream()
            .filter(isPerfectSquare)
            .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Perfect Squares: " + squares);
    }
}