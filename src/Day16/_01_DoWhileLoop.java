package Day16;

public class _01_DoWhileLoop {
    public static void main(String[] args) {

        int number = 5;

        while (number < 0){ // checks condition first
            ++number;
            System.out.println("While" + number);
        }

        do { // the block is guaranteed to execute at least once
            ++number;
            System.out.println("Do While " + number);
        } while (number < 0); // checks condition later



//        int number = 4;     // burdaki numara asagidakinden fazla olursa no printing.
//
//        while (number < 0){  // buradaki numaradan. tabi buyuk kucuge dikkat
//            ++number;
//            System.out.println("While"+ number);
//        }
//        do {
//            ++number;
//            System.out.println("Do while" + number);
//
//        }while (number < 0); // checks condition later

    }
}
