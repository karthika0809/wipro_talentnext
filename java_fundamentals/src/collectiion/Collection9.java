package collectiion;

import java.util.HashSet;
import java.util.Iterator;

// Program to store employee names in HashSet and iterate
public class Collection9 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Alice");
        names.add("Bob");
        
        System.out.println("Employee Names:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}