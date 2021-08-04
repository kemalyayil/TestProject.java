package Day7.StringMethods;

public class _13_Trim {
    public static void main(String[] args) {

        String welcomeMessage = "       Hello TechnoStudy        "; // it will remove the spaces at the beginning
        String trimmedString = welcomeMessage.trim();               // and at the end
        System.out.println(trimmedString);
        System.out.println(welcomeMessage.trim()); // kisa olani
    }
}
