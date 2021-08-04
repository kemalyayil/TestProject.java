package Day34;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_FinalWithReferenceTypes {

    public static void main(String[] args) {
        // When we say final , final for reference value NOT for elements in it.

        final String [] MONTHS = {"January","February","March","April",
                                "May","June","July","August","September",
                                "October","November","December"};

        System.out.println(Arrays.toString(MONTHS));

        MONTHS[0] = "First Month";          // can change elements cuz elements are NOT final
        //MONTHS[0] = new String [5];       // bu sekilde update edemeyiz cunku final.
        System.out.println(Arrays.toString(MONTHS));



        final ArrayList<String>list = new ArrayList<>();   // bu da ayni sekilde. element ekleyebiliriz.
        list.add("Text 1");                                 //ama list i update edemeyiz
        list.add("Text 2");



    }
}
