package Day7.StringMethods;

public class _14_Replace {
    public static void main(String[] args) {

        String myString =  "Hello World!";
        String ReplacedString = myString.replace('l' , '*'); // '' bunu kullanirsak tek karakter
        System.out.println(ReplacedString);

        String replacedString2 = myString.replace("Hello", "Hi"); // "" kelime
        System.out.println(replacedString2);

    }
}
