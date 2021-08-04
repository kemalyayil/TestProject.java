package Day26;

import java.util.ArrayList;

public class _01_2DCollectionsTask {

    // create 2d ArrayList which can store String ArrayLists
    // create 3 ArrayList which are Employees , Employers , Companies
    // Store this 3 ArrayList in 2D arrayList

    public static void main(String[] args) {
        ArrayList<ArrayList<String>>listOfLists = new ArrayList<>();

        ArrayList<String> employees = new ArrayList<>();
        ArrayList<String> employers = new ArrayList<>();
        ArrayList<String> companies = new ArrayList<>();

        listOfLists.add(employees);// you can add elements into this list
        listOfLists.add(employers);// you can add elements into this list
        listOfLists.add(companies);// you can add elements into this list

        System.out.println(listOfLists);



    }

}
