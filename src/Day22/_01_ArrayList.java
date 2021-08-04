package Day22;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList {
    public static void main(String[] args) {

        int[] array = new int[5]; // array regular. fixed size.



        ArrayList < Integer > list = new ArrayList<>();

        // adding elements
        // list.add(1) // line 27 icin
        list.add(5);
        list.add(2);
        list.add(9);

        // getting element at specific index
            //System.out.println(array[3]); bu sekilde istedgimiz index i basiyorduk.
        Integer elementAtIndex = list.get(1); // burada 2 yi cagirir (5,2,9)
        System.out.println(elementAtIndex);

        // add element to specific index ===> add element doesnt have this
        list.add(0, 1);  // aslinda burada yaptigimiz sey 0. index e 1 degerini vermek .
        Integer element = list.get(0);
        System.out.println(element);

        // print the arraylist
        System.out.println(list);

        // add will append at the end of the list (append = sona eklemek)
        list.add(11);  // bunu dedidgimizde en sona ekliyecek. rakam olarak ne yazdigin onemli deil
        System.out.println(list);

        // remove element at specific index

        list.remove(0);
        System.out.println(list);

        // remove first occurrence of an element
        Integer elementToRemove = 11;  // 11 olan elementi biulup silecek
        list.remove(elementToRemove);

        System.out.println(list); //[5, 2, 9]

        // set elements at specific index
        list.set(0,15); // bu deger update etmek icin kullaniliyor. 0 index 5 ti 15 ile degistirdik
        System.out.println(list); //[15, 2, 9]

        // get the number of elements in our list
        int sizeOfList = list.size();
        System.out.println(sizeOfList); //3

        // remove all elements in arrayList
        list.clear();
        System.out.println(list);  // []

        // check if arrayLists is empty
        boolean isListEmpty = list.isEmpty();
        System.out.println(isListEmpty);

    }
}
