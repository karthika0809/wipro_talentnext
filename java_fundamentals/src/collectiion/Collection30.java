package collectiion;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Program to filter palindromes using Predicate
public class Collection30 {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
    
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("radar");
        words.add("hello");
        words.add("level");
        words.add("world");
        words.add("deed");
        words.add("java");
        words.add("madam");
        words.add("test");
        words.add("racecar");
        words.add("code");
        
        // Filter palindromes using Predicate
        Predicate<String> isPalindrome = Collection30::isPalindrome;
        ArrayList<String> palindromes = words.stream()
            .filter(isPalindrome)
            .collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Original Words: " + words);
        System.out.println("Palindromes: " + palindromes);
    }
}
