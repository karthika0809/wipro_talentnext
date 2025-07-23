package collectiion;

import java.util.ArrayList;
import java.util.Iterator;

// Program to store Strings in ArrayList and print using Iterator
public class Collection3 {
    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("Elements in ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grape");
        
        printAll(list);
    }
}
