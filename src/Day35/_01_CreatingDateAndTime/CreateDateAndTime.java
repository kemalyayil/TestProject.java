package Day35._01_CreatingDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreateDateAndTime {

    public static void main(String[] args) {
        // returns both local and time
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        LocalDateTime dateTime = LocalDateTime.of(2021,12,30,12,30,59);
        System.out.println(dateTime);

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        LocalDateTime currentDateTime = LocalDateTime.of(currentDate,currentTime);
        System.out.println(currentDateTime);

    }
}
