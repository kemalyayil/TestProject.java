package Homework;

public class StringReverse {
   // public class ReverseStringUsingToCharArray {

        public static void main(String[] args) {

            String blogName = "coderolls.com";
            char [] stringCharArray = blogName.toCharArray();
            String reversedString = "";

            for(int i = stringCharArray.length-1; i>=0; i--) {
                reversedString = reversedString + stringCharArray[i];
            }

            System.out.print("The reversed string of the '"+blogName+"' is: " );
            System.out.println(reversedString);


        }
    }

