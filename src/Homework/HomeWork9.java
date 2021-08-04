package Homework;
public class HomeWork9 {
    public static void main(String[] args) {
//        1- Create 2 variables short & int | convert int to short | print short
        short numberOfTaxi = 30544;
        int myInt = (int) numberOfTaxi;
        System.out.println(myInt);

//        2- Create 2 variables float & double | convert double to float | print float
        float oneThirdOf100 = 33.33F;
        double myDouble = (double) oneThirdOf100;
        System.out.println(myDouble);

//        3- Create 2 variable byte & float | convert float to byte | print byte
        byte secondsInAMinute = 60;
        float myFloat = (float) secondsInAMinute;
        System.out.println(myFloat);

//  4- Calculate Average Price: Create 3 variables (int phonePrice = 399; double headphonePrice = 90.99; double laptopPrice = 999.89;) and create 1 more variable (int average) calculate average and print average
        int phonePrice = 399;
        double headphonePrice = 90.99;
                int headphonePriceInt = (int) headphonePrice;
        double laptopPrice = 999.89;
                int laptopPriceInt = (int) laptopPrice;
        int average = (phonePrice + headphonePriceInt + laptopPriceInt)/3;
        int average2 = (int) (phonePrice + headphonePrice + laptopPrice)/3;

       System.out.println(average);
       System.out.println(average2);

      

    }
}
