package Day14;

public class _01_Task {
    // for loops

    public static void main(String[] args) {

        //                Task 1
        // print numbers from 0 to 20 using for-loop
        // output should be in one line: 0 1 2 3....20

//                Task 2
        // print numbers from 20 to 0 using for-loop
        // output should be in one line: 20 19 18..0


        for ( int i = 0; i <= 20 ; i++){
            System.out.print(" " + i);
        }

        System.out.println(" ");

        for (int j = 20; j >= 0; j--) { // 0 yazarsak 0 i da print eder. 1 yazarsak 0 i print etmez
            System.out.print(" " + j);
        }
    }
}
