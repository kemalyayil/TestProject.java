package Day12;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        System.out.println(Math.random() * 100);

        Random random = new Random();
        int randomNumber = random.nextInt(100); // 0-100
        int numberBetween5and100 = random.nextInt(95) -5 ; // 90 ile -5 arasinda


       // generate random numbers between -100 and 100
        int numberBetween100and100 = random.nextInt(200) -100 ; // bound dan 100 cikartiyor , -100 ile 100 arasinda random number veriyor
        System.out.println(numberBetween100and100);

        // generate random numbers between -100 and 100 by using math random method
        int randomInteger = (int) (Math.random() * 200) -100;
        System.out.println(randomInteger);
        // in random class it has bound and returns into integer. but math.random returns to double.




    }
}
