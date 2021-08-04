package Day35._03_ComparingDateAndTime;

import java.time.LocalDate;

public class CompareDate {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate yesterday = now.minusDays(1);    // yesterday now - 1 day


        boolean isEqual = now.isEqual(yesterday);    // false
        System.out.println(isEqual);
        
        boolean isAfter = now.isAfter(yesterday);    // true = now is after yesterday
        System.out.println("isAfter = " + isAfter);

        boolean isBefore = now.isBefore(yesterday);   // False  = now is after yesterday
        System.out.println("isBefore = " + isBefore);

        boolean isLeapYear = now.isLeapYear();      // false. leap year = artik yil demek
        System.out.println(isLeapYear);

        LocalDate LeapYear = now.plusYears(3);
        System.out.println(LeapYear.isLeapYear());      // true. 2024 is a leapYear.

    }
    
}
