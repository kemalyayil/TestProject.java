package Mentoring.Day25_Haziran1;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMapComputeMethods {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);
        map.put(6,60);
        map.put(7,70);
        map.put(8,80);
        map.put(9,90);

        System.out.println(map);
        
        int orDefault = map.getOrDefault(9,1000);
        System.out.println("orDefault = " + orDefault);

        map.putIfAbsent(10,100);
        System.out.println("put if absent = " + map);

        map.compute(6,(key, value) -> value *= 100);   // burada calculation yaptik. key 6 yi 100 ile carptik
        System.out.println("After computing object 6 = " + map);

        for (Map.Entry<Integer,Integer> obj : map.entrySet()){
            map.compute(obj.getKey(),(k,v) -> v *10);
        }
        System.out.println("after for loop = "+ map);

        

    }
    
}
