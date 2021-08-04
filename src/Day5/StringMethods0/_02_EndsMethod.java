package Day5.StringMethods0;

public class _02_EndsMethod {

    public static void main(String[] args) {

        String newMessage = "Hello World";
        boolean endsWith = newMessage.endsWith("World"); // case sensitive.
        System.out.println(endsWith);
    }
}
