package collectiion;

import java.time.LocalDate;

//Program to display today's date and date after 10 days
public class Collection36 {
 public static void main(String[] args) {
     LocalDate today = LocalDate.now();
     LocalDate afterTenDays = today.plusDays(10);
     
     System.out.println("Today's Date: " + today);
     System.out.println("Date after 10 days: " + afterTenDays);
 }
}