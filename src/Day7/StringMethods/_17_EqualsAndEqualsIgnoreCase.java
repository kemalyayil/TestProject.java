package Day7.StringMethods;

public class _17_EqualsAndEqualsIgnoreCase {

    public static void main(String[] args) {

        String string1 = "TechnoStudy";
        String string2 = "TechnoStudy";
        String string3 = "technostudy";
        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3)); // considering case, they are not  equal.

        System.out.println(string1.equalsIgnoreCase(string2));
        System.out.println(string1.equalsIgnoreCase(string3));// ignoring keys sensitivity




    }


}
