package Day21;

public class _02_VarargsRecap {
    public static void varargs(int... list){
        System.out.println("int Varargs");
    }
    public static void varargs(String... list) {
        System.out.println("String Varargs");
    }

    // This method below will be ambiguous
//    public static void varargs(String str, String... list){ }

    public static void varargs(int number, String... list){}
    public static void varargs(String str, int number, String... list){ }

//    public static void varargs(int... varargs, String str){ } // varargs should be at the end
}
