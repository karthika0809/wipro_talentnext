package collectiion;

import java.time.LocalDate;

//Program to check if current year is a leap year
public class Collection39 {
 public static void main(String[] args) {
     LocalDate today = LocalDate.now();
     boolean isLeap = today.isLeapYear();
     
     System.out.println("Current year " + today.getYear() + " is " + 
                       (isLeap ? "a leap year" : "not a leap year"));
 }
}