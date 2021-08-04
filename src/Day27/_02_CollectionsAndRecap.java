package Day27;

import java.util.ArrayList;
import java.util.HashSet;

public class _02_CollectionsAndRecap {
    public static void main(String[] args) {
        // ArrayList is a dynamic-size array
        // ArrayList maintains elements in insertion order

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("TechnoStudy"); // add element
        arrayList.add(0, "Java"); // add element to specific index
        arrayList.size(); // will return the size of List
        arrayList.indexOf("Java"); // will return index of element
        arrayList.isEmpty(); // will return boolean empty/!empty
        arrayList.set(0, "Python"); // will update element
        arrayList.remove(0); // will remove element
        arrayList.get(0); // return element in specific index
        arrayList.contains("Java"); // will return boolean contains/!contains

        System.out.println(arrayList);


        // Sets are unordered collections
        // Sets don't allow duplicate values

        HashSet<Integer> set = new HashSet<>();

        set.add(5); // will add element
        set.add(1);
        set.add(86);
        set.remove(5); // will remove element
        set.isEmpty(); // return boolean empty/!empty
        set.contains(1); // return boolean contain/!contain
        set.size(); // will return size
        set.clear(); // will remove all elements

        // TreeSet: Stores elements in natural order (1,2,3,4,5) (A-Z)
        // HashSet: Unordered Set
        // LinkedHashSet: Stores elements insertion order

        // Maps are paired in Key-Value format

        // HashMap: Unordered map
        // TreeMap: Using key's natural order (1,2,3,4,5) (A-Z)
        // LinkedHashMap: Using insertion order
    }
}
