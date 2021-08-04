package Day23;

import java.util.HashSet;

public class _05_PrintElementsInSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("ABC");
        set.add("DEF");
        set.add("GHI");

        for (String element : set) {
            System.out.println(element);
            if (element == "ABC"){
                System.out.println(element);
            }
        }

    }
}
