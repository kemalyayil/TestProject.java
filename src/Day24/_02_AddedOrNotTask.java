package Day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _02_AddedOrNotTask {
    public static void main(String[] args) {
        // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
        // count how many duplicates we have

        // find out what are the duplicated values

        int [] numbers = {1, 3, 1, 2, 4, 5, 3};
        System.out.println(Arrays.toString(numbers));

        HashSet<Integer>set = new HashSet<>();
        ArrayList<Integer>duplicatedValues=new ArrayList<>(); // son kisim burda basliyor.

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isAdded = set.add(numbers[i]); // bunu yapmamizin nedeni ayni numara var mi yok mu
            if (!isAdded){ // bastaki unlem olmsuzluk. yukardaki boolean sonucuna bakarak "if isAdded false" yada if(isAdded == false) demek.tek = comparison yapmaz
                count++;    // false cunku iki tane benzer var. (1 ve 3) . o yuzden false yazip 2 tane cikaracak count++ da
                duplicatedValues.add(numbers[i]);
        }

        }
        System.out.println("We have " + count+ " duplicated values!");
        System.out.println("Duplicated values are " + duplicatedValues); //


    }
}
