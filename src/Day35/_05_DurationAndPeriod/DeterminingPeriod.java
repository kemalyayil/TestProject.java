package Day35._05_DurationAndPeriod;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DeterminingPeriod {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate pandemicStartDate = LocalDate.of(2020,3,15);

        LocalTime nowTime = LocalTime.now();
        LocalTime oneHourLater = nowTime.plusHours(1);

        Period between = Period.between(pandemicStartDate,now);         // in period start day is included, end day is excluded
        System.out.println("between = "+ between);

        Duration duration = Duration.between(nowTime, oneHourLater);
        System.out.println(duration);


    }

}