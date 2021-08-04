package Day23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _03_Set {

    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(9);
        set.add(3);
        System.out.println(set);
        System.out.println("Size : " + set.size());
        System.out.println("Is Empty ? =" + set.isEmpty()); // false
        System.out.println("is set containing 8? =" + set.contains(8)); //false
        System.out.println("is set containing 9? =" + set.contains(9)); //true

        set.remove(5);
        System.out.println("Print set after removing 5 :" + set);
        set.clear();
        System.out.println("Print set after clear method : " + set);


        ArrayList<Integer>list = new ArrayList<>();  // the difference. insertion order
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(9);
        list.add(3);
        System.out.println(list);
    }
}
