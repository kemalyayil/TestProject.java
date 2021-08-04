package Day20;

public class _01_MethodOverloading_HocaninKodu {
    public static void main(String[] args) {

        System.out.println(sum(5, 8));
        System.out.println(sum(5.7, 3.9));
        System.out.println(sum(7, 8.3));
        System.out.println(sum(5, 6, 8));

    }

    // Method Overloading:
    /*
    Method overloading is a concept of Java in which we can
    create multiple methods of the same name in the same class,
    and all methods work in different ways
     */

    public static int sum(int a, int b){ // signature method
        return a + b;
    }

    // number of parameters is different
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    // different parameter type and return type
    public static double sum(double a, double b){
        return a + b;
    }

    // different return type and different parameters
    public static double sum(int a, double b){
        return a + b;
    }

}
