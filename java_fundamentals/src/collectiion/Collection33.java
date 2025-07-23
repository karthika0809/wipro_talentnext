package collectiion;

import java.util.ArrayList;
import java.util.function.Consumer;

// Program to reverse words in ArrayList using Consumer
public class Collection33 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Orange");
        words.add("Grape");
        words.add("Mango");
        words.add("Pineapple");
        words.add("Cherry");
        words.add("Kiwi");
        words.add("Peach");
        words.add("Lemon");
        
        System.out.println("Original ArrayList: " + words);
        
        // Reverse each word and update list
        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            }
        };
        reverseWords.accept(words);
        
        System.out.println("Reversed ArrayList: " + words);
    }
}