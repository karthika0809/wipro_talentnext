package collectiion;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

// Program to find next month's second Sunday
public class Collection37 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusMonths(1).withDayOfMonth(1);
        LocalDate secondSunday = nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        
        System.out.println("Next month's second Sunday: " + secondSunday);
    }
}
