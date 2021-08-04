package Day46.StringSetImplementation;

import java.util.Arrays;

public class StringSetDemo {
    public static void main(String[] args) {

        //StringSet stringSet = new StringSet() { // kirmizi cizgi var StringSet te . cunku interfacelerde object olusturamayiz

//        StringSet stringSet = new StringSetImplementation1();
//        stringSet.add("Hello");
//        System.out.println("stringSet1 = " + stringSet);
//        stringSet.add("Techno");
//        System.out.println("stringSet2 = " + stringSet);
//        stringSet.add("Study");
//        System.out.println("stringSet3 = " + stringSet);
//        stringSet.add("Hello");
//        System.out.println("stringSet4 = " + stringSet);
//
//        System.out.println(stringSet.size());
//        stringSet.clear();
//        System.out.println(stringSet.size());

        // ikinci kisim.

        StringSet stringSet2 = new StringSetImplementation2();

        System.out.println(stringSet2.size());
        stringSet2.add("Hello");
        System.out.println(stringSet2.size());

        stringSet2.add("Techno");
        System.out.println(stringSet2.size());

        stringSet2.add("Study");
        System.out.println(stringSet2.size());

        stringSet2.remove("Hello");
        System.out.println(stringSet2.size());

        stringSet2.clear();
        System.out.println(stringSet2.isEmpty());

    }

}


