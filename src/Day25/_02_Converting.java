package Day25;

import java.util.*;

public class _02_Converting {
    public static void main(String[] args) {

        // Converting an Array to list

        Integer[] integers = new Integer[] {1,2,3,4,5};
        List<Integer>list = new ArrayList<>(Arrays.asList(integers)); // correct one
        System.out.println("Converted from Array to List = " + list);

        // this will be a fixed-size list- you can not use add method.
        List<Integer>fixedSizeList = Arrays.asList(integers);  // bunu da yapabiliriz ama element ekleme yapamayiz.
        //fixedSizeList.add(6); bunda hata verecek. cunku fixedsize olarak convert ettik. "unsupported operation exception" uyarisi verir


        //Converting list to Array
        Integer[] convertedFromList =list.toArray(new Integer[0]); // sifir yerine herhangi bi sey yazilabilir. ama 0 yazmada fayda  var.
        System.out.println("Converted from List to Array = "+ Arrays.toString(convertedFromList));

        //Converting an Array to set
        Set<Integer>set = new HashSet<>(Arrays.asList(integers));
        System.out.println("Converted from Array to Set = " + set);

        // Converting Set to Array
        Integer[] convertedFromSet = set.toArray(new Integer[0]);
        System.out.println("Converted from Set to Array = " + Arrays.toString(convertedFromSet));

        // converting List to Set
        Set<Integer>setFromList = new HashSet<>(list); // bu en cok , ayni value varsa isimize yarar. cunku set'de duplicate yok
        System.out.println("Converted list to Set = " + setFromList);

        // Converting Set to List
        List<Integer>listFromSet = new ArrayList<>(setFromList);
        listFromSet.add(9); // en sona ekler
        System.out.println("Converted Set to List = " + listFromSet);

    }

}
