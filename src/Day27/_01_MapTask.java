package Day27;

import java.util.HashMap;

public class _01_MapTask {
    // check, does this map contain key "Six"
    // if not put the it as "Six" = 6

    // part 2: check does this map contain key "Three"
    // if yes, change the value of it to 33

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

//        // First solution
//        Integer value = hashMap.get("Six");
//        if (value == null){
//            hashMap.put("Six" , 6);
//        }
//        System.out.println(hashMap);
        // part 2
//        Integer value2 = hashMap.get("Three");
//        if(value2 != null){
//        hashMap.put("Three", 33);
//        }
//        System.out.println(hashMap);


            // second solution
//        if (!hashMap.containsKey("Six")){ // benim cozum
//            hashMap.put("Six" , 6);
//        }
//        System.out.println(hashMap);

        // third solution
        hashMap.putIfAbsent("Six",6);
        System.out.println(hashMap);

        if (hashMap.containsKey("Three")){
            hashMap.put("Three",33);
        }
        System.out.println(hashMap);
    }
}