package Day9.MultiArray;

import java.util.Scanner;

public class Task1HocaninCodeU {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Q1 = "Where are you from?  ";
        System.out.print(Q1);
        String from = scanner.nextLine();
//        String born = "Izmir";


        String Q2 = "Where do you live?  ";
        System.out.print(Q2);
        String live = scanner.nextLine();

        System.out.println("");

        System.out.println("City you born -> " + from);
        System.out.println("City you live -> " + live);


    }
}
