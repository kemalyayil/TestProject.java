package Day26;

import javafx.print.Collation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _02_Map {
    public static void main(String[] args) {
        // In map we store in Key-Value format.
        // keys can not be duplicated, but values can. ikinci kez kullanildiginda update olarak goruyor. dolayisi ile ilkini gostermiyor

        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 100_000); // key is string, value is int for this case.
        salaries.put("Mike", 80_000);
        salaries.put("Rita", 200_000);
        salaries.put("Emily", 50_000);
        salaries.put("John", 150_000);  // burada sadece value print etti. bi daha john yazdirmadi
        salaries.put("Charles", 200_000);  // burada rita ile ayni maas olmasina ragmen , ikisini de print etti.
        // {Emily=50000, Charles=200000, Mike=80000, Rita=200000, John=150000}


        System.out.println("Salaries Map: " + salaries);
        System.out.println("Mike's salary: " + salaries.get("Mike")); // we can get elements using it's keys

        Set<String> keys = salaries.keySet(); // we store all the keys
        System.out.println("Keys of Salaries map: " + keys);

        System.out.println("Printing all elements using their keys:");
        for (String key : keys){ // we can get elements using it's keys
            Integer value = salaries.get(key);
            System.out.println(key + " = " + value);
        }

        Collection<Integer> values = salaries.values(); // we can get all the values and values only
        System.out.println("Printing all values using .values method: " + values);
        for (Integer value : values){
            System.out.println("Printing all values one by one: " + value);
        }

        // getting entries from our map
        Set<Map.Entry<String, Integer>> entrySet = salaries.entrySet(); // we're creating a set using entries in our map
        System.out.println("This set is created from our map: " + entrySet);
        for (Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        int sizeOfMap = salaries.size();
        System.out.println("Number of entries: " + sizeOfMap);

        boolean isEmpty = salaries.isEmpty();
        System.out.println("Is map empty? " + isEmpty);

        salaries.clear();
        System.out.println("Map after using clear method: " + salaries);
        isEmpty = salaries.isEmpty();
        System.out.println("Is map empty after clear method: " + isEmpty);

        }

    }


