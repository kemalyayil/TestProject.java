package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Odev34_ArrayList {
    /*
    1-
Create one method name is getCount()
Parameter is one String ArrayList , one String
return type is int.
Count how many times your parameter String occurs in the arraylist and return the count

                        For Example:
                        ArrayList is [Orange , Kiwi , Peach , Banana , Orange]
                        String is Orange
                        count should be 2

    2-
Create a method name is getSum()
Parameter is ArrayList
Return type is int
Sum all the numbers in the ArrayList
Return the result

                        For Example:
                        Arraylist is 1,2,3,4,5
                        return should be 15

    3-
Create a method name is getLength()
Parameter is one String ArrayList
return type is Integer arrayList
get the length of each String in the arrayList
return the each element's length

                        For example
                        ArrayList  :  ["New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"]
                        result should be Integer ArrayList:  [10 ,  8 , 4 , 7 , 6]

    4-
Create a method name is changeInArraylist()
parameters are  String arraylist , String s1 ,String s2
Change s1 to s2 in the arraylist
return the updated ArrayList

                        For example:
                        Arraylist  ["yellow" , "red" , "blue" , "red" , "blue"]
                        s1 = blue
                        s2 = yellow
                        change all the blue to yellow
                        result should be ["yellow" , "red" , "yellow" , "red" , "yellow"]

    5-
Create a method name is reverseList()
parameter is one String arrayList
reverse the arraylist
return the reversed String arraylist

                        For example:
                        Arraylist = ["New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"]
                        result should be ["Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"]

    6-
Create a method name is hillNum()
Parameter is Integer ArrayList
return type is int
if the number smaller than previous number and greater than next number then return the number

                        for Example
                        ArrayList is [5,4,6,2,1]
                        2 is smaller than 6 and greater than 1
                        return should be 2

     */

    public static void main(String[] args) {
        //Task1 print
        ArrayList<String> myArray = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        System.out.println(getCount(myArray, "Kiwi"));

        //Task2 print
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(getSum(list));

        //Task3 print
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println(getLength(myList));

        //Task4 print
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("yellow", "red", "blue", "red", "blue"));
        System.out.println(changeInArraylist(arr, "blue", "yellow"));

        //Task5 print
        ArrayList<String>list2 =new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println(reverseList(list2));

        //Task6 print
        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(5,4,6,2,1));
       // System.out.println(hillNum(numbers));


    }

    //Task 1
    public static int getCount(ArrayList<String> arr, String str) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(str)) {
                count++;
            }
        }
        return count;
    }

    //Task2
    public static int getSum(ArrayList<Integer> myList) {

        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum = sum + myList.get(i);

        }
        return sum;
    }

    //Task3
    public static ArrayList<Integer> getLength(ArrayList<String> elementsLength) {

        ArrayList<Integer> sizeList = new ArrayList<>();

        for (int i = 0; i < elementsLength.size(); i++) {
            sizeList.add(elementsLength.get(i).length());

        }
        return sizeList;

    }

    //Task4
    public static ArrayList<String> changeInArraylist(ArrayList<String> list, String s1, String s2) {
            for (String element : list)
                if (element.equals(s1))
                    list.set(list.indexOf(s1), s2);
            return list;
    }
    //Task5
    public static ArrayList<String> reverseList(ArrayList<String>list){

        ArrayList<String>reversed = new ArrayList<>(list);
        //System.out.println("reversed = " + reversed);

        for (int i = 0; i < list.size(); i++) {
            reversed.set(i,list.get(list.size()-1-i));      //set = degistirir
            //reversed.add(list.get(list.size()-1-i));      //add = ekler
        }

     return reversed;
    }
    //Task6
//    public static ArrayList<Integer>hillNum(ArrayList<Integer>num){
//
//        ArrayList<Integer>myArray = new ArrayList<>(num);
//
//
//        for (int i = 0; i < num.size(); i++) {
//            if (num.get(i) < num.get(i-1) && num.get(i) > num.get(i + 1)){
//                System.out.println(num.get(i));
//            }
//        }
//        return ;



    }






