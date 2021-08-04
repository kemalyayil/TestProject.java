package Day22;

import java.util.ArrayList;
import java.util.Random;

public class _03_ArrayListTask {
    // create a method that will create an arrayList of integers
    // with 5 random numbers(1 to 10) and return it

    // part2: create a method that updates the middle element to the element that's provided in parameter
    // [3, 4, 1, 6, 9]  -> provided parameter 100 -> [3, 4, 100, 6, 9]

    public static ArrayList<Integer> createRandomList(int number){

        ArrayList<Integer> myList = new ArrayList<>();

        Random generator = new Random();

        for (int i = 0; i < number; i++){
            myList.add(generator.nextInt(9)+1);
        }

        return myList;
    }

    public static void updateMiddleElement(ArrayList<Integer> arrayList, Integer element){
        int middleElement = arrayList.size() / 2;
        arrayList.set(middleElement, element);
    }


    public static void main(String[] args) {

        ArrayList<Integer> firstList = createRandomList(9);
        System.out.println("First List = " + firstList);

        updateMiddleElement(firstList, 1000);
        System.out.println(firstList);

    }
    }

