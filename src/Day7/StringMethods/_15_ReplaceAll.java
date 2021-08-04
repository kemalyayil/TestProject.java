package Day7.StringMethods;

public class _15_ReplaceAll {

    public static void main(String[] args) {

        String myString =  "Hello World!";
        String replacedAllString = myString.replaceAll("l" ,"*");
        System.out.println(replacedAllString);

        String myNumber = "My number is 534678912 call me";
        String ReplaceAllNumber = myNumber.replaceAll("[4-8]", "#");// regex regular expression
        System.out.println(ReplaceAllNumber); // yukardaki square brakets onemli

        // difference between replace and replaceAll
        // replace accepts strings and characters
        // replaceAll accepts regex + regular expression

        String replacedAllNumber2 = myNumber.replaceAll("[1-4]", "-");
        System.out.println(replacedAllNumber2);

        String replacedAllNumber3 = myNumber.replaceAll("[a-z]", "-");
        System.out.println(replacedAllNumber3); // bastaki m degismedi . cunku upper case.
    }
}
