package collectiion;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collections;

// Program to perform operations on TreeSet of Strings
public class Collection10 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grape");
        
        // a. Reverse the elements
        System.out.println("Reversed TreeSet:");
        TreeSet<String> reversedSet = new TreeSet<>(Collections.reverseOrder());
        reversedSet.addAll(set);
        System.out.println(reversedSet);
        
        // b. Iterate using Iterator
        System.out.println("\nIterating TreeSet:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // c. Check if element exists
        String search = "Banana";
        System.out.println("\nDoes " + search + " exist? " + set.contains(search));
    }
}
