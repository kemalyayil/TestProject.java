package Day35._02_ManuplatingDateAndTime;

import java.time.LocalDateTime;

public class ManipulatingDateAndTime {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        
        LocalDateTime localDateTime = currentDateTime.plusWeeks(5).minusHours(7);
        System.out.println("localDateTime = " + localDateTime);

    }
}
