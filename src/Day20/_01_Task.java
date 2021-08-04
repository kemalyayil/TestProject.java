package Day20;

public class _01_Task {
    // create a multiply method, that takes two integers and returns their product as integer
    // create a multiply method, that takes three integers and returns their product as integer
    // create a multiply method, that takes two doubles and returns their product as double
    // create a multiply method, that takes three doubles and returns their product as double
    // create a multiply method, that takes one double and one integer and returns their product as double
    // create a multiply method, that takes one integer and one double and returns their product as integer
    public static void main(String[] args) {
        System.out.println(multiplyMethod(3,5));
        System.out.println(multiplyMethod(3,4,5));
        System.out.println(multiplyMethod(5.3,5.8));
        System.out.println(multiplyMethod(7.7, 3.4,6.6));
        System.out.println(multiplyMethod(5.5, 8));
        System.out.println(multiplyMethod(6,7.7));


    }

    public static int multiplyMethod(int a, int b) {
        return a * b;
    }

    public static int multiplyMethod(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiplyMethod(double a, double b) {
        return a * b;
    }

    public static double multiplyMethod(double a, double b, double c) {
        return a * b * c;
    }

    public static double multiplyMethod(double a, int b) {
        return a * b;
    }

    public static int multiplyMethod (int a, double b) {
        return (int) (a * b);
    }
}