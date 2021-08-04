package Day6.StringMethods;

public class _09_Substring {
    public static void main(String[] args) {


        String welcome = "Hello TechnoStudy!";
        String substring = welcome.substring(6); // yazilan sayidan sonrasini yazdiriyor.
        System.out.println(substring);

        String substring2 = welcome.substring(0,5); // that is the range that you wanna print
        System.out.println(substring2);

    }
}
