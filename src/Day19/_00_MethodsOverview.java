package Day19;

public class _00_MethodsOverview {

    public static void main(String[] args) {

        String str = "TechnoStudy";

        char chr = str.charAt(0); //  char chr = T ; || charAt returns char

        printNumbers();

        printNumbers2(9);
        printNumbers2(1);

        int number = returnInteger(5);  // it wll return 5.
        System.out.println(number);


    }
    public static void printNumbers(){
        System.out.println(5);   // bu her zaman 5 basacak yukariya yazdigimiz zaman

    }

    public static void printNumbers2(int number){
        System.out.println(number);  // ama burda parameter kullandigimiz icin yukarda istedigimiz kadar farkli
                                        // rakam basabiliriz.
    }

    public static int returnInteger(int number){  // this methods takes int number as a parameter
        return number;                              // and returns number
    }
}
