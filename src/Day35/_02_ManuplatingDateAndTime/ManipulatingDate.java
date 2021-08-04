package Day35._02_ManuplatingDateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class ManipulatingDate {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        currentDate.plusDays(7);   // date is immutable, not changing
        System.out.println("Current Date after 7 plusDays : " + currentDate);

        LocalDate plus7Days = currentDate.plusDays(7);  // bu sekilde baska bi variable da yapinca 7 gun sonrasi
        System.out.println(plus7Days);                  // gosterildi

        LocalDate plus4Years = currentDate.plusYears(4);
        System.out.println("plus4Years = " + plus4Years);
        
        LocalDate minus5Days = currentDate.minusDays(5);
        System.out.println("minus5Days = " + minus5Days);

        LocalDate futureDateCombined = currentDate.plusDays(3).plusYears(1);
        System.out.println("Updated date with plus 3 days and 1 years" + futureDateCombined);

        LocalTime timeWithoutSeconds = LocalTime.of(10,30);
        System.out.println(timeWithoutSeconds);

        LocalTime localTime = timeWithoutSeconds.plusHours(3).plusMinutes(13);
        System.out.println(localTime);


    }
}
