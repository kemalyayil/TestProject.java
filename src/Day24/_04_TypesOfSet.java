package Day24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _04_TypesOfSet {
    public static void main(String[] args) {

        /*
        What kind of set are there? (Sets are not allowing duplicated elements- it is general for all)
        hashset = unordered
        linkedSet = maintaining insertion  order
        treeSet = ascending order
         */

        // hashset is unordered
        //HashSet<String>myHashSet = new HashSet<>(); //ikisi de ayni
        Set<String>myHashSet = new HashSet<>();

        myHashSet.add("USA");
        myHashSet.add("France");
        myHashSet.add("Turkey");
        myHashSet.add("China");
        myHashSet.add("Germany");
        myHashSet.add("Mexico");
        System.out.println(myHashSet);

        // Linked hashset + is maintaining insertion order
        Set<String>myLinkedHashSet = new LinkedHashSet<>();

        myLinkedHashSet.add("USA");
        myLinkedHashSet.add("France");
        myLinkedHashSet.add("Turkey");
        myLinkedHashSet.add("China");
        myLinkedHashSet.add("Germany");
        myLinkedHashSet.add("Mexico");
        System.out.println("This is LinkedHashSet : " + myLinkedHashSet);

        // TreeSet - it stores elements in ascending order. a to z

        Set<String>myTreeSet = new TreeSet<>();
        myTreeSet.add("USA");
        myTreeSet.add("France");
        myTreeSet.add("Turkey");
        myTreeSet.add("China");
        myTreeSet.add("Germany");
        myTreeSet.add("Mexico");
        System.out.println("This is TreeSet : " + myTreeSet);
    }
}
