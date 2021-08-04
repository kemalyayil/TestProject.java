package Day34._01_Task1;

public class TimeConverter {
    /*
                Part1
     -Create a class called TimeConverter,
        which has some final attributes
            +final seconds in a minute
            +final minutes in an hour
     -create methods to convert seconds into minutes
        and minutes into seconds

     Part2
     create methods to convert minutes into hours
     and hours into minutes
     */


    final static int secondsInAMinute = 60;             // bunlar static olmasa line 26 da kirmizi oluyor.
    final static int minutesInAnHour = 60;

    static int convertSecondsIntoMinutes(int seconds){
        return seconds/secondsInAMinute;
    }

    static int convertMinutesIntoSeconds(int minutes){
        return minutes*secondsInAMinute;
    }

    static int convertMinutesIntoHours(int minutes){
        return minutes/minutesInAnHour;
    }

    static int convertHoursIntoMinutes(int hour){
        return hour*minutesInAnHour;
    }


}