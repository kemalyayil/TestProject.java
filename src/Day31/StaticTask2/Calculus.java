package Day31.StaticTask2;

public class Calculus {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int subtractAbs(int a, int b) {
        return Math.abs(a - b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if(b == 0){
            System.out.println("You are dividing by zero");
            
        }
        return a / b;
    }
}
