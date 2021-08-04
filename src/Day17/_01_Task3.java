package Day17;

public class _01_Task3 {
    public static void main(String[] args) {
        // print the multiplication table for all numbers from 1 to 10
        /*

        1 x 1 = 1
        1 x 2 = 2
        1 x 3 = 3
        .
        .
        .
        .
        ---------------------------------------
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6


         */

        for (int i = 1; i <= 10 ; i++ ){
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + "*" + j + "=" + i* j);;

            }
            System.out.println("-----------");
        }


    }
}
