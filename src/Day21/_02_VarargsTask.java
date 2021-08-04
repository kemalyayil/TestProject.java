package Day21;

public class _02_VarargsTask {

    // create concat method with varargs
    // for int and char
    // return type should be String

    public static String concat(int... varargs) {

        String result = "";

        for (int i = 0; i < varargs.length; i++) {
            result += Integer.toString(varargs[i]);
        }
        return result;
    }

    public static String concat(char... varargs) {

        String result = "";

        for (int i = 0; i < varargs.length; i++) {
            result += Character.toString(varargs[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(concat(1, 5, 6, 3, 9, 0));
        System.out.println(concat('a', 'f', 'y', 'r'));

    }
}

