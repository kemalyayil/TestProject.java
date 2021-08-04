package Day23;

import java.util.ArrayList;
import java.util.Random;

public class _02_ArrayListTask {

    // create an array list of 4 random integers  (Main)
    // create a method that adds element at random position
    // public static void addAtRandomPosition(ArrayList<Integers> list, Integer element)

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {  // 4 element oldugu icin 4 yazdik
            list.add(rnd.nextInt());
        }
        System.out.println(list);

        addAtRandomPosition(list,0); // eklemesi gerekli olan rakam i zero olarak belirledik
        System.out.println(list);
    }

    public static void addAtRandomPosition(ArrayList<Integer> list, Integer element){
        Random rnd = new Random();
        int index = rnd.nextInt(list.size()-2); // from 0 to list size()-1  - cunku nextint method da bound yok. ondan.
        list.add(index,element);

    }
}
