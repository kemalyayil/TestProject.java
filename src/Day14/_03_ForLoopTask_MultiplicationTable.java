package Day14;

import java.util.Scanner;

public class _03_ForLoopTask_MultiplicationTable {
    public static void main(String[] args) {
        // write a java program which will show
        // multiplication table of 2
        //ex:  // i   (iteration deniyor ) Asagidaki formulde olan i burdan geliyor.
        //    2 x 1 = 2
        //    2 x 2 = 4
        //    2 x 3 = 6             numFromUser ;
        //    2 x 4 = 8             for ( int i = 1; i <= 10;> i++){
        //    2 x 5 = 10            numfu = numfu * i;
        //    2 x 6 = 12            sout
        //    2 x 7 = 14
        //    2 x 8 = 16
        //    2 x 9 = 18
        //    2 x 10 = 20
        // using for-loop

        //int num2 = 2;  // ikinci task icinde bu yoktu , ondan comment out yaptim


        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter one number");
        int num2 = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++){ // "<=" dememizin nedeni 10 da dahil oldugundan
            System.out.println(num2 +  "*" + i + "=" + (num2 * i));
        }


    }
}
