package Day12;

public class MathClassKendinYap {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = -3;

        System.out.println(Math.abs(c)); // negatifi pozitife cevirir
        System.out.println(Math.max(a,b)); // iki variable dan hangisi buyukse onu print eder
        System.out.println(Math.max(a,5)); // variable ve numberdan hangisi buyukse onu print eder
        System.out.println(Math.min(c,b));

        //round

        System.out.println(Math.round(2.2));
        System.out.println(Math.round(2.5)); // 5 ve uzerini yukari round ediyor
        System.out.println(Math.round(2.6));

        //ceil   | round direction is always up

        System.out.println(Math.ceil(2.2));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.ceil(2.6));

        // floor | round direction is always

        System.out.println(Math.floor(2.2));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.floor(2.6));


        System.out.println(Math.sqrt(25)); // karakok alir. sonuc double verir
        System.out.println((int) (Math.sqrt(25))); // bu sekilde integer a ceviririz

        System.out.println(Math.pow(2,2)); // 2 uzeri 2

        System.out.println(Math.random() * 100); // returns double. 1-100 arasi random numara verir
        System.out.println((int) (Math.random() * 100)); // bu sekilde decimal number vermez convert den sonra
        System.out.println(Math.round(Math.random() *100)); // round methodunu kullanarak da decimal den kurtulabiliriz

    }
}
