package Day5;

public class StringMethod {
    public static void main(String[] args) {

        String myString = "Intellij is cool!!";

        System.out.println(myString.toLowerCase());

        System.out.println(myString.toUpperCase());
        System.out.println(myString.startsWith("I")); // yazdigimiz harfi boolean a ceviriyor.
        System.out.println(myString.endsWith("cool!!"));
        System.out.println(myString.length());// it counts everything. 18 karakter.
        int lengthOfMyString = myString.length();
        System.out.println(myString.indexOf('l')); // I yazsak sifir sonucunu cikaracak. cunku ordan basliyor.
                                                    // l yazdigimizda 4 cikiyor. nerde oldugunu soyluyor.
                                                    // olmayan bi karakter yazarsan sonucu -1.

        System.out.println(myString.toLowerCase().indexOf("i")); // burada kac tane "i" oldugunu bulmak icin
                                                                // once harflerin hepsini kucuk yaptik.
                                                                // sonra index yazip arattik.sonuc sifir





    }
}
