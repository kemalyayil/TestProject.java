package Day39;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();             // sadece Test class olusturduk, burada bu line i ekledik.
        //test.             // yazdigimizda bissuru method geliyor opsiyon olarak. nerden geliyor? java nin icerisinde
                            // object class var ordan geliyor.

        Test test1 = test;
        System.out.println(test.equals(test1));  // true.   line 12 ye new yazip yeni olustursaydik, farkli olacagi
                                                // icin sonuc "false" print edecekti


        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());


        test.toString();

    }
}
