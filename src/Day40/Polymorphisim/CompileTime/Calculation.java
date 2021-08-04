package Day40.Polymorphisim.CompileTime;

// overloading should be in same class, with different parameters.same class, same name, method different parameter
//  overriding: diff class, parent child relationship,  same method name and parameter
public class Calculation {
    //overloading
    public static void add(int a , int b){
        System.out.println("This is sum of 2 integers = "+ a + b);

    }


    //overloading
    public static void add(double a , double b){
        System.out.println("This is sum of 2 doubles = "+ a + b);
    }


    //overloading
    public static void add(int a , int b, int c){
        System.out.println("This is sum of 3 integers = " + a + b + c);
    }


    //overloading
    public static void add(double a , double b,double c){
        System.out.println("This is sum of 3 doubles = "+ a + b + c);
    }


}
