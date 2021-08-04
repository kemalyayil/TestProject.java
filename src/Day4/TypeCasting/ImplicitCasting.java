package Day4.TypeCasting;

public class ImplicitCasting {

    public static void main(String[] args) {

        //Implicit Casting (Automatically) - Widening Casting
        // byte > short > integer > long > float > double

        byte byteNumber = 50;
        short shortNumber = byteNumber;

        System.out.println(shortNumber);

        short shortNumber2 = 2222;
        int integerNumber = shortNumber2;

        System.out.println(integerNumber);

        int intNumber = 55563673;
        long longNumber = intNumber;
        System.out.println(intNumber);

        short x = 1;
        int y = x + 3;
        //basically java will create an anonymous memory to fulfill that converting. From short to int
        //int anonymous = 1; and the result will be 4 automatically
        // we don't know where that variable is stored in our memory. And Java copies our short value to that integer.
        System.out.println(y);


        float floatNumber = 1.354F;
        double doubleNumber = floatNumber;
        System.out.println(doubleNumber);

//        double a = 1.5;
//        int b = a + 3 ;  java converts 3 as 3.0
//        int b = 1.5 + 3.0;
//        int b = 4.5;
//        So as a general rule implicit casting happens whenever we're not going to lose data!


        double a = 2.1;
        double b = a+1;
        System.out.println(b);

        int toDouble = 3;
        double fromInteger = toDouble;
        System.out.println(fromInteger);

        short toFloat = 1;
        float fromShort = toFloat;
        System.out.println(fromShort);

//            Create 2 variables short & long | convert short to long | print long
//            Create 2 variables float & double | convert float to double | print double
//            Create 2 variables byte & float | convert byte to float | print float

        short var1 = 10;
        long var2 = var1;
        System.out.println(var2);

        float var3 = 10.1F;
        double var4 = var3;
        System.out.println(var4);

        byte var5 = 24;
        float var6 = var5;
        System.out.println(var6);



    }
}
