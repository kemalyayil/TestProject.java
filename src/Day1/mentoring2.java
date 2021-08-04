package Day1;

public class mentoring2 {

//static int default Value; // yeni bi sey
    static long defaultValue;

    public static void main(String[] args) {
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("minByteValue = " + minByteValue);

        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("maxByteValue = " + maxByteValue);

        // Create a meaningful variable for byte primitive type.

        byte age = 35;
        System.out.println(age);

        byte number1 = -120;
        byte number2 = 8;
        int result = number1 + number2; // yeni bi sey.
        System.out.println(result);
        System.out.println(number1 + number2);


        short minShortValue =Short.MIN_VALUE;
        short maxShortValue =Short.MAX_VALUE;
        System.out.println("maxShortValue = " + maxShortValue);
        System.out.println("minShortValue = " + minShortValue);
        
        short sizeOfHDD = 16000;
        System.out.println("sizeOfHDD = " + sizeOfHDD);

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(minIntValue);
        System.out.println(maxIntValue);
       // System.out.println(defoultValue); // yeni bi sey

        int number5 = 15000;        // soru : iki rakam i toplarken , sonucu range aralagini dusunursek, alip a
        int number6 = 100000;       // almiycagimizi boolean ile yaptigimiz formulle anlayabiliriz.

        boolean condition = maxIntValue > (number5*number6);
        System.out.println("condition = " + condition);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println(minLongValue);
        System.out.println(maxLongValue);
        System.out.println(defaultValue);


            }
}
