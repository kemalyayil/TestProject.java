package Day5.StringMethods0;

public class _01_StartsWith {

    public static void main(String[] args) {

        String newMessage = "Hello World!";

        boolean startsWithHello = newMessage.startsWith("Hello");

        System.out.println(startsWithHello);

        boolean secondWordStartingWithW = newMessage.startsWith("W", 6);

        System.out.println(secondWordStartingWithW);


    }
}
