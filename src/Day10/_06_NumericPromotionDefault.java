package Day10;

public class _06_NumericPromotionDefault {
    public static void main(String[] args) {
        byte x = 2;
        byte y = 4;

        int result = x + y ;   // all values by default are int
        byte result3 = (byte) (x + y);  // yukaridaki detaydan dolayi convert ettik
        System.out.println(result);
        System.out.println(result3);




    }
}
