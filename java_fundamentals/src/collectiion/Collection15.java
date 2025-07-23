package collectiion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Program to manage contacts in HashMap with generics
public class Collection15 {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();
        contacts.put("John", 1234567890);
        contacts.put("Jane", 987654321);
        contacts.put("Alice", 555555555);
        
        // a. Check if key exists
        String searchKey = "John";
        System.out.println("Does key '" + searchKey + "' exist? " + contacts.containsKey(searchKey));
        
        // b. Check if value exists
        int searchValue = 987654321;
        System.out.println("Does value '" + searchValue + "' exist? " + contacts.containsValue(searchValue));
        
        // c. Iterate using Iterator
        System.out.println("\nContact List:");
        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}