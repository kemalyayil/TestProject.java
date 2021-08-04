package Day23;

import java.util.HashSet;

public class _03_SetTask {
    // create a String[] array of student name in your group, you might make duplicates
    // add all of them to a set

    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}

    // create a method that takes set and String[], method should adds all elements to the set

    public static void main(String[] args) {

      String [] students = {"Hamza", "Liping" , "Kemal", "Gulsum","Julie","Sinan","Kevser"};

      HashSet<String> setOfStudents = new HashSet<>();

      for (int i = 0; i < students.length; i++){
          setOfStudents.add(students[i]);
      }
        System.out.println(setOfStudents);

      addAll(setOfStudents, "Hafid", "Rahima", "Arzu");
      System.out.println(setOfStudents);


      String [] arr = {"Zeynep", "Numan", "Lizhou"};
      addAllAsArray(setOfStudents,arr);
      System.out.println(setOfStudents);

    }
    public static void addAll(HashSet<String>set, String... str){
        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }
    }
    public static void addAllAsArray(HashSet<String>set,String[]strArray){
        for (int i = 0; i < strArray.length; i++) {
            set.add(strArray[i]);


        }
    }
}

