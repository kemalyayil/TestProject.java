package Day26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _03_MapTask {
    public static void main(String[] args) {
        // create a map of zipcodes and Cities, at least 3 entries
        // get the keySet and iterate over it, print the map like below:
        // zipcode1 => city1
        // zipcode2 => city2

        // part 2: print all the keys of the map
        HashMap<String,Integer>citiesAndZip = new HashMap<>();
        citiesAndZip.put("Buenos Aires", 12345);
        citiesAndZip.put("Washington DC", 889988);
        citiesAndZip.put("Ankara", 98265);

        Set<String>keys = citiesAndZip.keySet();

        for (String key : keys){
            Integer value = citiesAndZip.get(key);
            System.out.println(key + "=>" + value);
        }

        // Part 2
        System.out.println("Part 2 = " + keys);

        }

    }

