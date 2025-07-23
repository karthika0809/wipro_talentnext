package collectiion;

import java.time.LocalTime;

//Program to display current time and time after 25 minutes
public class Collection40 {
 public static void main(String[] args) {
     LocalTime now = LocalTime.now();
     LocalTime after25Minutes = now.plusMinutes(25);
     
     System.out.println("Current Time: " + now);
     System.out.println("Time after 25 minutes: " + after25Minutes);
 }
}