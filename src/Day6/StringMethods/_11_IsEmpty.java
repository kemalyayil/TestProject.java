package Day6.StringMethods;

public class _11_IsEmpty {

    public static void main(String[] args) {

        String name = "Halit";
        System.out.println(name.isEmpty());

        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        String emptyString2 = " "; // burda space var.
        System.out.println(emptyString2.isEmpty());
    }
}
