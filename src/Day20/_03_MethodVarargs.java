package Day20;

public class _03_MethodVarargs {

    public static void main(String[] args) {

        System.out.println(allStringsInSameLine("Java" , "Python" ,  "C++"));
    }

    public static String allStringsInSameLine (String ... varargs ){

        String allStrings = "";
        for (int i = 0; i < varargs.length; i++){
            allStrings += varargs[i];
        }
        return allStrings;
    }

}
