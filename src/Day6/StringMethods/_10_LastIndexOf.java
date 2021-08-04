package Day6.StringMethods;

public class _10_LastIndexOf {
    public static void main(String[] args) {

        String message = "Hello Techno Study"; // first index of space we wanna find
        int firstIndexSpace = message.indexOf(' ');
        System.out.println(firstIndexSpace);
        System.out.println(message.indexOf(" ")); // kisa olani

        int lastIndexSpace = message.lastIndexOf(" ");
        System.out.println(lastIndexSpace);
        System.out.println(message.lastIndexOf(" "));// kisa olani

    }
}
