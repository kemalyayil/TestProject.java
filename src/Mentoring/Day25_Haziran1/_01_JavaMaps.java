package Mentoring.Day25_Haziran1;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMaps {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);

        System.out.println(map);

        map.replace(1,1000);
        System.out.println(map);

        int integer = map.get(1);    // you have to specify the key. return will be value of that key
        System.out.println("get method = "+ integer);


        map.remove(1);
        System.out.println("Remove 1 = "+map);
    }
}
