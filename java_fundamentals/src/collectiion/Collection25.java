package collectiion;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

// Program to filter negative even numbers using Stream API
public class Collection25 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(rand.nextInt(21) - 10); // Numbers from -10 to 10
        }
        
        System.out.println("Original ArrayList: " + numbers);
        
        // Filter negative even numbers
        ArrayList<Integer> negativeEvens = numbers.stream()
            .filter(n -> n < 0 && n % 2 == 0)
            .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Negative Even Numbers: " + negativeEvens);
    }
}