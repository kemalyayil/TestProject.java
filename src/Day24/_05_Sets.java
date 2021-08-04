package Day24;

import java.util.HashSet;
import java.util.Set;

public class _05_Sets {

    public static void main(String[] args) {

        Set<Integer>set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set); // sonuc burda [1, 2, 3]... ama bu ordered manasina gelmiyor.
                                // java da HashTable konusunda gorebiliriz

    }
}
