package Day35._01_CreatingDateAndTime;

import java.time.LocalTime;

public class CreateLocalTime {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime breakTime = LocalTime.of(19,50);
        System.out.println(breakTime);

        LocalTime endOfClass = LocalTime.of(21,50,35);
        System.out.println(endOfClass);


    }

}
