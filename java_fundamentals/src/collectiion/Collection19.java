package collectiion;

import java.util.ArrayList;
import java.util.function.Consumer;

// Program to reverse strings in ArrayList using lambda
public class Collection19 {
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
        
        // Reverse strings using lambda
        Consumer<String> reverse = s -> System.out.println(new StringBuilder(s).reverse().toString());
        System.out.println("Reversed Strings:");
        al.forEach(reverse);
    }
}
