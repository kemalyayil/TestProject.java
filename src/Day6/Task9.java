package Day6;

public class Task9 {
    public static void main(String[] args) {

        // return the last word from "Hello Techno Study!"
        String returning = "Hello Techno Study!";
        String substring2 = returning.substring(13,18); // karakter araligini yazdirdik.
        String substring3 = returning.substring(13); // iki durumda da aynisini yazdirdik
        System.out.println("2 = " + substring2);
        System.out.println("3 = " + substring3);
    }
}
