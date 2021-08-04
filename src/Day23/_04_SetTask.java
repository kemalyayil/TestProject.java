package Day23;

import java.util.HashSet;

public class _04_SetTask {
    // create a method that takes set and varargs of Char and adds all elements to the set
    // create a method that takes set and Char[], method should adds all elements to the set

    public static void main(String[] args) {

    }

    public static void myChar(HashSet<Character> set, Character... char2){
        for (int i = 0; i < char2.length; i++) {
            set.add(char2[i]);

        }
    }
    public static void arrSet ( HashSet<Character> set, char[] char3){
        for (int i = 0; i < char3.length; i++) {
            set.add(char3[i]);

        }
    }
}
