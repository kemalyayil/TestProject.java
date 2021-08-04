package Day4;

public class PrimitiveDataTypesRecap {

    public static void main(String[] args) {

        float recapFloat = 1.234567892345F; // floats are sufficient to store up to 7 decimal digits
        double recapDouble = 1.234567892345; // doubles are sufficient to store up to 15 decimal digits

        System.out.println(recapFloat);
        System.out.println(recapDouble);

        double recapDouble2 = 9; //JVM converts integer to double automatically.
        System.out.println(recapDouble2);

        boolean isNight = false;
        boolean isSummer = true; // true and false are reserved names thats why we cant use as the identifier
        System.out.println(isNight);
        System.out.println(isSummer);

        char letter = 'A';
        char number = '3';
        char specialCharacter = '?';
        char singleQuote = '\'';
        System.out.println(letter);
        System.out.println(number);
        System.out.println(specialCharacter);
        System.out.println(singleQuote);

        char randomFromKeyboard1 = 72;
        char randomFromKeyboard2 = 101;
        char randomFromKeyboard3 = 108;
        char randomFromKeyboard4 = 111;
        System.out.print(randomFromKeyboard1);
        System.out.print(randomFromKeyboard2);
        System.out.print(randomFromKeyboard3);
        System.out.print(randomFromKeyboard3);
        System.out.print(randomFromKeyboard4);




    }
}
