package Day35._03_ComparingDateAndTime;

import java.time.LocalTime;

public class CompareTime {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime twoMinutesInFuture = now.plusMinutes(2);

        boolean isEqual = now.equals(twoMinutesInFuture);       // False
        boolean isAfter = now.isAfter(twoMinutesInFuture);      // False
        boolean isBefore = now.isBefore(twoMinutesInFuture);    // True

        System.out.println(isEqual);
        System.out.println(isAfter);
        System.out.println(isBefore);


    }
}
