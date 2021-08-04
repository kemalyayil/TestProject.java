package Mentoring.Day25_Haziran1;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaComputeExa {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(07652,"Paramus");
        map.put(11230,"Brooklyn");

        for (Map.Entry<Integer,String> obj : map.entrySet()){
            map.compute(obj.getKey(), (key , value ) -> value = value.concat(" Borough"));
        }
        System.out.println(map);

        map.computeIfAbsent(07652, v ->"Manhattan Borough");
        System.out.println("not changing anything = "+map);

        map.computeIfAbsent(99652, v ->"Manhattan Borough");
        System.out.println("changing the value  = " +map);

        map.computeIfPresent(8,(key,value) -> value += 500);
        System.out.println("After compute if present method = " + map);
    }

}
