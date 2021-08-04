package Day24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_AddedOrNot {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        set.add(3);
        set.add(98879);
        set.add(5);
        set.add(78);
        set.add(1);

        set.add(3); // return method boolean oldugu 3 varsa false cikaracak, dolayisi ile yazdirmayacak.Arraylist return type degisik oldugu icin kabul eder
        System.out.println(set);

        boolean isAdded = set.add(3);
        System.out.println(isAdded);// false cikacak. cunku var

        boolean isAdded2 = set.add(2); // true cikacak cunku yok
        System.out.println(isAdded2);





    }
}
