package Day5.StringMethods0;

public class _05_StringLength {

    public static void main(String[] args) {

        String longString = "0123456789abcdefghi";

        int lengthOfString = longString.length();
        System.out.println(lengthOfString);
        System.out.println(longString.length());

        String shortString = "abc";
        int lengthOfShortString = shortString.length();
        System.out.println(lengthOfShortString);
    }
}
