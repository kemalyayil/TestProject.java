package Day7;

import java.util.Date;

public class Task1 {

    public static void main(String[] args) {

//        Date now = new Date();
//        System.out.println(now);
//        String convertToDate =now.toString();
//        System.out.println(convertToDate);
//        String replaceNumbers = convertToDate.replaceAll("[0-9]", "*");
//        System.out.println(replaceNumbers);
//        System.out.println(now.equals(convertToDate));

        //Task
        // First create a Date object which is "now"
        Date now = new Date();
        System.out.println(now);

        // Then convert this 'now' variable to a String
        String convertedDate = now.toString();
        System.out.println(convertedDate);

        // Now replace all numbers with '*'
        String replacedDate = convertedDate.replaceAll("[0-9]", "*");
        System.out.println(replacedDate);

        // And check if the first Date object is equal to our string
        System.out.println(convertedDate.equalsIgnoreCase(replacedDate));



    }
}
