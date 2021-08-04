package Day35.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {

        /*
        LocalDate now = LocalDate.now();

     1- 5 days ago
     2- 2 hours later
     3- 3 weeks plus, 4 hours minus, 50 minutes plus
         */
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime fiveDaysBefore = now.minusDays(5);
        System.out.println("fiveDaysBefore = " + fiveDaysBefore);

        LocalDateTime twoHoursLater = now.plusHours(2);
        System.out.println("twoHoursLater = " + twoHoursLater);

        LocalDateTime weekHoursMin = now.plusWeeks(3).minusHours(4).plusMinutes(50);
        System.out.println("weekHoursMin = " + weekHoursMin);



    }

}
