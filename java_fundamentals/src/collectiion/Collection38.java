package collectiion;

import java.time.LocalDate;
import java.time.Period;

// Program to calculate experience at Wipro
public class Collection38 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1); // Example start date
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(startDate, currentDate);
        
        System.out.println("Experience at Wipro:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
