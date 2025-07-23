package collectiion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Program to perform operations on HashMap of Strings
public class Collection13 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "Apple");
        map.put("key2", "Banana");
        map.put("key3", "Orange");
        
        // a. Check if key exists
        String searchKey = "key2";
        System.out.println("Does key '" + searchKey + "' exist? " + map.containsKey(searchKey));
        
        // b. Check if value exists
        String searchValue = "Banana";
        System.out.println("Does value '" + searchValue + "' exist? " + map.containsValue(searchValue));
        
        // c. Iterate using Iterator
        System.out.println("\nIterating HashMap:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
