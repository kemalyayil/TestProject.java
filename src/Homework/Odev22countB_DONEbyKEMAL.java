package Homework;

import java.util.Scanner;

public class Odev22countB_DONEbyKEMAL {

/*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1
        */


    //hint: .charAt, length(), for, index, counter,

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

//      code start here
        int counter = 0;
        String textLowerC = text.toLowerCase();
        for (int i = 0; i < textLowerC.length(); i++){
            if (textLowerC.charAt(i) == 'b'){  // yanlislikla ; koymusum. sonuc farkli cikti.
            counter++;
            }
        }
        System.out.println("The input contains " + " " + counter + " " +'b' + " " + "letter");
    }
}