package Day18;

import java.util.Scanner;

public class _01_DebuggingJavaApp2 {
    public static void main(String[] args) {

        int number = 1;
        System.out.println(number);
        number++;
        System.out.println(number);

        if (number > 1)                             // if te sadece 1 tane sout varsa, {} olmak zorunda deil
            System.out.println("Larger than 1");
        else
            System.out.println("Less than 1");  // ; den sonra artik if le iliski kesiliyor.
        System.out.println("After If Else Statement"); // bu independent.

        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
