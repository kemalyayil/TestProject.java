package Day21;

public class _00_MethodsRecap {

    // Method Types
    public static void voidMethod(){ // void methods don't return
        System.out.println("Void Method");
    }

    public static void voidMethodWithParameters(int number){
        System.out.println(number);
    }

    public static int returnIntWithoutParameter(){
        return 1;
    }

    // overloading
    // method name should be same - they should be in same class
    public static int returnIntWithParameters(int a){
        return a;
    }

    // overloading
    public static double returnIntWithParameters(double a){
        return a;
    }
}
