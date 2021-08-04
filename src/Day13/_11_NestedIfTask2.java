package Day13;

import java.util.Scanner;

public class _11_NestedIfTask2 {
    // get 2 numbers from user
    // if first number is larger than zero, check second number, if second number is larger than 5 print "ok" else print "not ok"
    // if first number is less than or equal to zero, print "too cold to check"
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("temp  =");
        int temp = scanner.nextInt();

        System.out.print("pressure  =");
        int pressure = scanner.nextInt();

        if (temp>0){
            if (pressure > 5){
                System.out.println("Ok");
            }else{
                System.out.println("not ok");
            }

        }
        else{
            System.out.println("too cold to check");
        }


    }



}
