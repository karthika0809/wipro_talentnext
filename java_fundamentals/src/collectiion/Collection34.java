package collectiion;

import java.util.ArrayList;
import java.util.function.Consumer;

// Program to display odd/even numbers using Consumer
public class Collection34 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        
        // Display odd/even using Consumer
        Consumer<Integer> oddEven = n -> System.out.println(n + " " + (n % 2 == 0 ? "even" : "odd"));
        System.out.println("Numbers with odd/even status:");
        numbers.forEach(oddEven);
    }
}
