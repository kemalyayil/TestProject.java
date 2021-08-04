package Day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class _01_CollectionsTask {
    public static void main(String[] args) {
        // create list of 5 numbers from user input
        // sort the list in reverse order(!= reversing) and print it
        // shuffle the list and print it
        // rotate right by 3 places and print it


        // part 2: find the max number and min number, print them
        // replace all max number with min number


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();

        Random rnd = new Random();

        for (int i = 0; i < 5 ; i++) {
            System.out.print("Enter your number = ");
            list.add(scanner.nextInt());
        }

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted  = " + list);

        Collections.shuffle(list);
        System.out.println("shuffled = " + list);

        Collections.rotate(list, 3);
        System.out.println("Rotated right by 3 pl = " + list);

        // part 2
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("Max number = " + max);
        System.out.println("Min number = " + min);

        Collections.replaceAll(list,max,min);
        System.out.println("Replace max to min " + list);

            // bir daha bak. bi yerde hata var
    // hata cozuldu. zira line 27 de random class tan element eklemisim scanner yerine.




    }
}
