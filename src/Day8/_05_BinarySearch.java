package Day8;

import java.util.Arrays;

public class _05_BinarySearch {
    public static void main(String[] args) {
        // to find of index of sth. but there is difference. sorting. allocates 3 parts and then searches it.
        int[] intArray ={6,2,7,9,16,1,20,5};
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        int indexOfElement = Arrays.binarySearch(intArray,16 );
        System.out.println(indexOfElement);


    }
}
