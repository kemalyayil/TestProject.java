package Day18;

public class _03_MethodsParameters {
    public static void main(String[] args) {

        greetUser("George");
        greetUser("Lizhou");
        greetUser("Julie");
        greetUser("Hamza");
        greetUser("Liping");
        greetUser("Kemal");

    }


    public static void greetUser(String name) {
        System.out.println("Hello!" + name + "!");
    }

}
