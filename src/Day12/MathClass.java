package Day12;

public class MathClass {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = -3;

        System.out.println(Math.abs(c)); //  that will make negative numbers to positive
        System.out.println(Math.max(a,b)); // that will print greater number
        System.out.println(Math.max(a,5)); // that will print greater number// also variable+number possible
        System.out.println(Math.min(a,b)); // that will print smaller number

        //round

        System.out.println(Math.round(3.4)); // will round the number shorter decimal point. 3
        System.out.println(Math.round(3.5)); //4
        System.out.println(Math.round(3.6)); //4

        //ceil   | round direction is always up

        System.out.println(Math.ceil(7.1));  // 8.0
        System.out.println(Math.ceil(7.5));  // 8.0
        System.out.println(Math.ceil(7.6));  // 8.0   // returns double

        // floor | round direction is always
        System.out.println(Math.floor(1.4));  // 1.0
        System.out.println(Math.floor(1.5));  // 1.0
        System.out.println(Math.floor(1.6));  // 1.0   // returns double

        System.out.println(Math.sqrt(16)); //  karekok    4
        System.out.println((int)Math.sqrt(16)); // karakok

        System.out.println(Math.pow(3,4)); // 3 uzeri 4. 3x3x3x3

        System.out.println(Math.random());  // returns double between 0 and 1 . her bastiginda randomly baska numara gelecek
        System.out.println(Math.random() * 100); // 1 ile 100 arasi numaralari random almak istiyorsak
        System.out.println((int) (Math.random() * 100)); // int e cevirdik decimal point den kurtulmak icin
        System.out.println(Math.round(Math.random() * 100)); // we can also use round method to get rid of decimal points
        // mentoring de day11 e bak





    }
}
