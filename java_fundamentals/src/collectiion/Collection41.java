package collectiion;

import java.time.LocalTime;

//Program to display current time and time before 5 hours 30 minutes
public class Collection41 {
 public static void main(String[] args) {
     LocalTime now = LocalTime.now();
     LocalTime before5Hours30Minutes = now.minusHours(5).minusMinutes(30);
     
     System.out.println("Current Time: " + now);
     System.out.println("Time before 5 hours 30 minutes: " + before5Hours30Minutes);
 }
}
