package Homework;

import java.util.Random;

public class _00_RandomClass {
    public static void main(String[] args) {
        int random = randomNumber(30);      // buraya herhangi bi deger veriyoruz
        System.out.println("Random number is ==> " + random);



    }
    public static int randomNumber(int max){    // once bu kisimdan baslamak lazim. sonra main method kismi
                                                // gelmeli
        Random random = new Random();
        int myRandomNumber = random.nextInt(max); // buradaki max line 13 te olan.
        return myRandomNumber;
    }
}
