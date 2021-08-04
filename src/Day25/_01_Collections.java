package Day25;

import java.util.*;

public class _01_Collections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set =new HashSet<>();

        Random rnd = new Random();

        for (int i = 0; i < 7; i++) {
            list.add(rnd.nextInt(10));
            set.add(rnd.nextInt(10));
        }
        System.out.println(list);
      //  System.out.println(set);  // ayni olanlari yazdirmadi



        Collections.addAll(list, 15,34,66,10); // to add multiple elements list / set
         //Integer[] arr = {99, 44, 55, 22};  // array de kullanilabilir eklemek icin.
         //Collections.addAll(list, arr);


        Collections.sort(list);     // sorts in ascending order
        System.out.println("Sort method    = " + list);

        Collections.sort(list,Collections.reverseOrder()); // it stores elements in descending order. remember it is not reversing.
        System.out.println("Reverse order  = " + list);// buyukten kucuge siralayacak.

        Collections.shuffle(list);
        System.out.println("Shuffle method = " + list); // shuffles list randomly

        Collections.rotate(list , 2);  // negative numbers will rotate left, positive numbers will rotate right
        System.out.println("Rotate method  = " + list);

        Collections.replaceAll(list , 2, 99); // all values that provided will be updated tode the new value
        System.out.println("ReplaceAll method = " + list);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("Max number     = " + max);
        System.out.println("Min number     = " + min);

        System.out.println("This is SET: " + set);
        Integer maxOfSet = Collections.max(set);
        Integer minOfSet = Collections.min(set);
        System.out.println("Max number of set     = " + maxOfSet);
        System.out.println("Min number of set     = " + minOfSet);

        Collections.sort(list);
        int search = Collections.binarySearch(list, 5); // to do binary search you should sort the list first
        System.out.println(search);

    }
}
