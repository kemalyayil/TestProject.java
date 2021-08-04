package Day15;

import java.util.Locale;
import java.util.Scanner;

public class _02_WhileLoopWithScanner {
    public static void main(String[] args) {
        // Alt kisimda detayli aciklama var, bak
        Scanner scanner = new Scanner(System.in);
        String input = "";


        while (!input.equals("quit")){

            System.out.println("Enter input: ");
            input = scanner.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("quit")){
                break;
            }
            System.out.println(input);

//            Scanner scanner = new Scanner(System.in); // bu sekilde yapinca, loop dongusunde donup ayni seyi read edip print etmiyor.
//            // memory den tasarruf
//            String input = "";
//
//            //while (input != "quit"){  // we can use comparison operators(!=) for only primitive data types.
//            while (!input.equals("quit")){ // while da boyle yapinca quit yazana kadar print ediyor.
//                //Scanner scanner = new Scanner(System.in); // bunu buraya koyarsak cok fazla yazdiriyor. memory de cok yer. ondan yukari koyduk
//                System.out.println("Enter input: ");
//                input = scanner.nextLine().toLowerCase(); // bu da olabilir tolowercase.
//                if (input.equalsIgnoreCase("quit")){ // ignorecase uyguladik, cunku buyuk yazarlarsa
//                    break; // quit diye yazdirmiyor. bunu sonradan ekledik. oncekilerde quit yazdigimiz
//                }           // zaman quit yazip duruyordu. simdi tekrar yazmiyor direk duruyor.
//                System.out.println(input);
        }

    }
}
