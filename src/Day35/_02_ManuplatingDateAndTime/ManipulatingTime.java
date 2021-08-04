package Day35._02_ManuplatingDateAndTime;

import java.time.LocalTime;

public class ManipulatingTime {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime timeInFuture = currentTime.plusHours(3);
        System.out.println("timeInFuture = " + timeInFuture);

        LocalTime combinedTimeFuture = currentTime.plusHours(5).minusMinutes(10);
        System.out.println("combinedTimeFuture = " + combinedTimeFuture);

        LocalTime timeWithoutSeconds = LocalTime.of(10,30);
        System.out.println("timeWithoutSeconds = " + timeWithoutSeconds);

        LocalTime localTime = timeWithoutSeconds.plusHours(3).minusMinutes(13);
    }
}
