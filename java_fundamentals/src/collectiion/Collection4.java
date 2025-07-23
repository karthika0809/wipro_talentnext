package collectiion;

import java.util.ArrayList;

//Program to store only numbers in ArrayList using generics
public class Collection4 {
 public static void main(String[] args) {
     ArrayList<Number> numbers = new ArrayList<>();
     numbers.add(10);        // Integer
     numbers.add(3.14f);     // Float
     numbers.add(2.718);     // Double
     
     System.out.println("Numbers in ArrayList:");
     for (Number num : numbers) {
         System.out.println(num);
     }
     
     // This would cause a compile-time error:
     // numbers.add("String"); // Error: String is not a Number
 }
}