package collectiion;

import java.util.ArrayList;
import java.util.function.Predicate;

// Program to print strings with odd length using lambda
public class Collection20 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Grape");
        al.add("Mango");
        al.add("Pineapple");
        al.add("Cherry");
        al.add("Kiwi");
        al.add("Peach");
        al.add("Lemon");
        
        System.out.println("Original ArrayList: " + al);
        
        // Filter strings with odd length using lambda
        Predicate<String> oddLength = s -> s.length() % 2 != 0;
        System.out.println("Strings with odd length:");
        al.stream().filter(oddLength).forEach(System.out::println);
    }
}