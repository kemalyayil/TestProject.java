package Day27;

import java.util.*;

public class _01_MapTask2 {

    // PART 1
    // create a map groups and members of group
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]

    // PART 2
    // count how many members each group has

    // PART 3
    // store inside a new map, the number of members each group has
    // "Group1" = 2
    // "Group2" = 3


    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> groupsAndMembers = new HashMap<>();
        ArrayList<String>sales = new ArrayList<>(Arrays.asList("James", "Joe" , "Mark"));
        ArrayList<String>dev = new ArrayList<>(Arrays.asList("Kemal" , "Gulsum" , "Liping" , "Rahime"));

        groupsAndMembers.put("Sales", sales);
        groupsAndMembers.put("Development" ,dev);
        System.out.println(groupsAndMembers);

//        int sizeForSales = sales.size();
//        int sizeForDev = dev.size();
//        System.out.println("Size of sales = " + sizeForSales);
//        System.out.println("Size of dev = " + sizeForDev);

        //Part 2
        Set<String>keys = groupsAndMembers.keySet();
        for (String key : keys){
            ArrayList <String> groupMembers = groupsAndMembers.get(key);
            System.out.println("Number of members in " + key + " " + groupMembers.size()); // burda yazdigimiz "size" onemli
                               //        burasi hikaye kismi      // asil formul en sondaki
        }

        // Part 3





    }

}
