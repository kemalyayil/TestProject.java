package Day47;

import Day46.StringSetImplementation.StringSet;
import Day46.StringSetImplementation.StringSetImplementation1;

public class TestStringSet {
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
    }


    public static void  testCase1(){
        StringSetImplementation1 set = new StringSetImplementation1();          // day 46 da olusturduk. ve oradaki metotlari kullaniyoruz
        set.add("Hello");

        int expected = 1;
        int actual = set.size();

        if (expected == actual){
            System.out.println("Test Case 1 is Passed");
        }else {
            System.out.println("Test Case 1 is Failed");
        }
    }
    public static void  testCase2(){
        StringSet set = new StringSetImplementation1();
        set.add("Hello");
        set.remove("Hello");

        int expected = 0;
        int actual = set.size();

        if (expected == actual){
            System.out.println("Test Case 2 is Passed");
        }else {
            System.out.println("Test Case 2 is Failed");
        }

    }

    public static void testCase3 () {
        StringSet set = new StringSetImplementation1();
        set.add("Hello");
        set.add("Hello");

        int expected = 1;
        int actual = set.size();

        if (expected == actual){
            System.out.println("Test Case 3 is Passed");
        }else {
            System.out.println("Test Case 3 is Failed");
        }
    }
    public static void testCase4(){

    }
}
