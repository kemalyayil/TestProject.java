package Day18;

public class _04_MethodsWithReturnType {

    public static void main(String[] args) {

        String myMethod = greetUser();

        System.out.println(myMethod);


    }

    public static String greetUser(){

        String greetMessage = "Hello";

        return greetMessage;
    }
}
