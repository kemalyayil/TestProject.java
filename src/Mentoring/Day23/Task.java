package Mentoring.Day23;

import java.util.Arrays;
import java.util.HashSet;

public class Task {
    // 1- Create a void method to initialize the Set. This method should have two parameters: HashSet and String array
    // 2- Create a method, to get all names of students in the school? it should return Hashset, and two string arrays as parameter.
    // 3- Create a method to find how many students take ONLY Math class? it should return Hashset, and two string arrays as parameter.
    // 4- Create a method to find how many students take both classes. it should return Hashset, and two string arrays as parameter.
    // 5- Create a method to find how many students join only 1 class (it can be Math or Chemist)(kume deki A ve B) ? it should return Hashset, and two string arrays as parameter.
    // 6- Create a method to get the list of all students, whose name doesn`t start with "S", and doesn`t contain any "e", and if the name has not more than 5 letters.  it should return Hashset, and two string arrays as parameter.



    public static void main(String[] args) {
        String[] mathClass = {"Michael", "Debi", "John", "Steven", "Adam", "Nia", "Gerard", "Lucas", "Leeann", "Griffin", "Rebekah", "Sunshine", "Smith"};

        String[] chemistClass = {"Lara", "Nia", "Griffin", "Rebekah", "Reggie", "Steward", "Gresham", "Sunshine", "Steven", "John", "Rebekah", "Andrew", "Douglas"};

        //Part 1 print
        HashSet<String>class1 = new HashSet<>();
        initSet(class1,mathClass);
        System.out.println("class1 = " + class1);

        //Part 2 print
        HashSet<String> allStudents = allStudents(mathClass, chemistClass);
        System.out.println("All students = "+ allStudents);
        System.out.println("size for all students= " + allStudents.size());

        //Part 3 print
        HashSet<String> onlyOneClass = onlyOneClassStdents(mathClass, chemistClass);
        System.out.println("onlyOneClass = " + onlyOneClass);
        
        //Part 4 print
        HashSet<String> bothClasses = bothClasses(mathClass,chemistClass);
        System.out.println("bothClasses = " + bothClasses);

        //Part 5 print
        HashSet<String> singleClassStudents = singleClassStudents(mathClass, chemistClass);
        System.out.println("singleClassStudents = " + singleClassStudents);

        //Part 6 print
        HashSet<String> someClassStudents = someClassStudents(mathClass, chemistClass);
        System.out.println("someClassStudents = " + someClassStudents);


    }
    // Part 1
    public static void initSet(HashSet<String> set, String[] strArr) {
        set.addAll(Arrays.asList(strArr));
        
    }
    // Part 2
    public static HashSet<String> allStudents(String[] str1, String[] str2) {
        HashSet<String> myHashSet1 = new HashSet<>();
        HashSet<String> myHashSet2 = new HashSet<>();
//        myHashSet1.addAll(Arrays.asList(str1));
//        myHashSet2.addAll(Arrays.asList(str2));

        initSet(myHashSet1, str1);
        initSet(myHashSet2, str2);
        myHashSet1.addAll(myHashSet2);
        return myHashSet1;
    }

    //Part 3
    public static HashSet<String> onlyOneClassStdents(String[] class1, String[] class2) {
        HashSet<String> myHashSet1 = new HashSet<>();
        HashSet<String> myHashSet2 = new HashSet<>();

        initSet(myHashSet1, class1);
        initSet(myHashSet2, class2);

        myHashSet1.removeAll(myHashSet2);    //  ortak olanlari cikar
        return myHashSet1;
    }
    //Part 4
    public static HashSet<String> bothClasses(String[] class1, String[] class2) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        initSet(set1, class1);
        initSet(set2, class2);

        set1.retainAll(set2);               // ortak elemnlari muhafaza et, bize yazdir
        return set1;
    }
    //Part 5
    public static HashSet<String>singleClassStudents(String[] str1, String[] str2){
    HashSet<String>totalStudents = allStudents(str1,str2);      //metot line 50
    totalStudents.removeAll(bothClasses(str1,str2));          // metot line 74 ten aldik

    return totalStudents;
    }
    // Part 6
    public static HashSet<String>someClassStudents(String[] str1, String[] str2){
        HashSet<String>totalStudent = allStudents(str1, str2);
        totalStudent.removeIf(student -> student.startsWith("S") || student.contains("e") || student.length()>5 );

        return totalStudent;
    }

}
