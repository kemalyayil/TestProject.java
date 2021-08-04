package Day30;

public class StaticMethods {


    int nonStatic = 55;
    static int intStatic = 4;

    public static void printStatic(){
        System.out.println("This is a static method");
//        printNonStatic(); this gives an error, because we cannot access non-static instances from a static method
        printStatic2(); // Able to access, because this is a static method
//        System.out.println(nonStatic); this gives an error, because we cannot access non-static instances from a static method
        System.out.println(intStatic); // able to access
    }

    public static void printStatic2(){
        System.out.println("This is a static method");
    }

    public void printNonStatic(){
        System.out.println("This is not a static method");
        printStatic(); // static method available
        printNonStatic2(); // non-static method available
        System.out.println(intStatic); // static variable available
        System.out.println(nonStatic); // non-static variable available
    }

    public void printNonStatic2(){
        System.out.println("This is not a static method");
    }



}

