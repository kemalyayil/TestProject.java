package Day21;

public class _01_MethodOverloadingTask {
    // create method that's called concat
    // it takes two parameters and returns them concatenated
    // it can accept parameter types: int, char
    // overload all possible parameter data types for the method
    // it returns a String

    public static String concat(int a, int b){
        return Integer.toString(a) + Integer.toString(b);
    }

    public static String concat(char a, char b){
        return Character.toString(a) + Character.toString(b);
    }

    public static String concat(int a, char b){
        return Integer.toString(a) + Character.toString(b);
    }

    public static String concat(char a, int b){
        return Character.toString(a) + Integer.toString(b);
    }

    public static void main(String[] args) {

        System.out.println(concat(1, 5));
        System.out.println(concat('a', 'z'));
        System.out.println(concat(5,'t'));
        System.out.println(concat('t',5));

    }
}
