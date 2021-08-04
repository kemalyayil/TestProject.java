package Day12;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        /*

        If temp >= 30 print hot
        If temp >= 18 && 30 print it is a good weather
        If temp < 18 print cold

         */

        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();

        if (temp > 30){
            System.out.println("It is a hot day !");
            System.out.println("Drink a lot of water !");

        }else if (temp < 30 && temp >= 18){
            System.out.println("It is a good weather");
        } else {
            System.out.println("It is a cold day");
        }


    }
}
