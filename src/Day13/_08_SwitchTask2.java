package Day13;

import java.util.Scanner;

public class _08_SwitchTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String currentDay = scanner.nextLine();

        switch (currentDay){            // bunu if else ile yapamayiz. break olmadi icin, break kaldirdigimiz zaman
            case "Monday" :             // geride kalanlari da print ediyor. ama if else de bu yok. buldugunu print ediyor if else,
                System.out.println("Monday");

            case  "Tuesday" :
                System.out.println("Tuesday");

            case  "Wednesday" :
                System.out.println("Wednesday");

            case "Thursday" :
                System.out.println("Thursday");

            case "Friday" :
                System.out.println("Friday");

            case "Saturday" :
                System.out.println("Saturday");

            case "Sunday" :
                System.out.println("Sunday");

                //default:   // bunu cikartim aradaki farki anlamak icin


        }



    }
}
