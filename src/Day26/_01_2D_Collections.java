package Day26;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _01_2D_Collections {
    public static void main(String[] args) {

        int [][] twoDArray = new int[1][1];
        System.out.println(Arrays.deepToString(twoDArray));

        ArrayList<ArrayList<String>> listOfList = new ArrayList<>(); // this is a list that can contain list of lists.

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Toyota");

        ArrayList<String>cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("London");
        cities.add("Berlin");

        listOfList.add(cars);
        listOfList.add(cities);

        System.out.println(cars);
        System.out.println(cities);

        System.out.println(listOfList);

        ArrayList<HashSet<Integer>>listOfSets = new ArrayList<>(); // this list can hold HashSet values

        HashSet<Integer>firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);

        HashSet<Integer>secondSet = new HashSet<>();
        secondSet.add(2);
        secondSet.add(3);
        secondSet.add(4);

        listOfSets.add(firstSet);
        listOfSets.add(secondSet);
        System.out.println(firstSet);
        System.out.println(secondSet);

        System.out.println(listOfSets);





    }

}
