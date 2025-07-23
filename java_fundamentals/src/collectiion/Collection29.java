package collectiion;

import java.util.ArrayList;
import java.util.function.Function;

// Program to calculate sum of numbers using Function
public class Collection29 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        
        // Calculate sum using Function
        Function<ArrayList<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        };
        
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sumFunction.apply(numbers));
    }
}