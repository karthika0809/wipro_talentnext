package collectiion;

import java.util.ArrayList;

//Program to create an ArrayList, add all months of a year, and print them
public class Collection1 {
 public static void main(String[] args) {
     // Create ArrayList and add months
     ArrayList<String> months = new ArrayList<>();
     months.add("January");
     months.add("February");
     months.add("March");
     months.add("April");
     months.add("May");
     months.add("June");
     months.add("July");
     months.add("August");
     months.add("September");
     months.add("October");
     months.add("November");
     months.add("December");
     
     // Print all months
     System.out.println("Months of the year:");
     for (String month : months) {
         System.out.println(month);
     }
 }
}