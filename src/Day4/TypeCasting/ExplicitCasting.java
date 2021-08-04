package Day4.TypeCasting;

public class ExplicitCasting {

    public static void main(String[] args) {

// Explicit Casting (Manually) - Narrowing Casting
        // explicit casting will happen only compatible types
        // byte-short-int-long-float-double

        long myLong = 289736L;
        int myInteger = (int) myLong;

        System.out.println(myInteger);

        int myInteger2 = 5555;
        short myShort = (short) myInteger2;

        System.out.println(myShort);

        short myShort2 = 89;
        byte myByte = (byte) myShort2;

        System.out.println(myByte);

        // double -> float

        double myDouble = 2.55;
        float myFloat = (float) myDouble;

        System.out.println(myFloat);

        float toShort = 5.1F;
        short fromFloat = (short) toShort;

        System.out.println(fromFloat);

        // double -> integer

        double toInteger = 2.9;
        int fromDouble = (int) toInteger;

        System.out.println(fromDouble);

        // Task
        double a = 1.5;
        int b = (int) a + 3;

        System.out.println(b);


        short shortNumber = 129;
        byte byteNumber = (byte) shortNumber; // because short is bigger then byte, it will overflow on the other side

        System.out.println(byteNumber); // it will overflow by 2


//        -128              127
//        <------------------->


    }
}
