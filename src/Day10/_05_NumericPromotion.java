package Day10;

public class _05_NumericPromotion {
    public static void main(String[] args) {

        int intNumber = 5;
        long longNumber = 5;
        int result = (int) (intNumber + longNumber); // long buyuk oldugu icin manual convert yapmak lazim
        long result2 = intNumber + longNumber; // burda long oldugu icin bastaki, convert e gerek yok. buyuk zaten
        byte result3 = (byte) (intNumber + longNumber);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);


    }
}
