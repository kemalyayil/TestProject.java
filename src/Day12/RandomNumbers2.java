package Day12;

public class RandomNumbers2 {

    public static void main(String[] args) {

        //int randomNumber = (int)  (Math.random() *100 -50);
        //                          50 - (-50) = 100
        //        -50 <---------------------0----------------------> 50

        int min = 7;
        int max = 93;
        int randomNumber = (int)  (Math.random() * (max-min) + min); // formula

        // generate random number between 25 - 390
        int randomInteger = (int) (Math.random() * 365) + 25;
        System.out.println(randomInteger);


    }
}
