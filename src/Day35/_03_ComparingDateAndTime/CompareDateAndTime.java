package Day35._03_ComparingDateAndTime;

import java.time.LocalDateTime;

public class CompareDateAndTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now2 = LocalDateTime.now();

        boolean isEqual = now.isEqual(now2);
        boolean isAfter = now.isAfter(now2);
        boolean isBefore = now.isBefore(now2);

        // Depending on the processor speed we might get different result
        System.out.println(isEqual);
        System.out.println(isAfter);
        System.out.println(isBefore);

        boolean isLeapYear = now.toLocalDate().isLeapYear();  // leap year methodunu direk kullanamiyoruz
        System.out.println(isLeapYear);                      //toLocalDate(). yazdiktan sonra kullanabiliyoruz


    }
}
