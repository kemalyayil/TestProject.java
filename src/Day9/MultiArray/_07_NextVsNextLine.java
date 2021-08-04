package Day9.MultiArray;

import java.util.Locale;
import java.util.Scanner;

public class _07_NextVsNextLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name : ");
        //String name = scanner.next(); // next sadece bi kelime alir, digerlerini gostermez
       // String name = scanner.nextLine(); // o line  i okur.
        String name = scanner.nextLine().trim(); // bu da onde arkada bosluk varsa alir
        System.out.println("");
        System.out.println("Your name : " + name);


    }
}
