package Day18;

public class _02_Methods2 {
    public static void main(String[] args) {

        greetUser();  // bunu en son yazdik. ve print gerceklesti
        greetUser();            // // System.out.println("Hello!") normalde
        greetUser();
        printHelloWorld();
        printHelloWorld();
    }


    public static void greetUser() {     // sadece 11 ve 12 . sirayi yazmak yetmez. yukardaki main methodda da olmasi lazim
        System.out.println("Hello!");   // print icin
    }

    public static void printHelloWorld() {

        System.out.println("Hello World!");
    }
}


