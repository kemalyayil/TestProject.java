package Day12;

public class StringToPrimitive {
    public static void main(String[] args) {
        String number ="123";
        String number2 = "100";
        int numberFromString = Integer.parseInt(number);
        int numberFromString2 = Integer.parseInt(number2);

        System.out.println(number + number2);  // 123100  (before converting)
        System.out.println(numberFromString+numberFromString2);  // 223  (after converting)


    }
}
