package Day31.StaticTask2;

public class MainCalculus {
    public static void main(String[] args) {

        //one of the main features of static is to be able called without creating a new object
        System.out.println("Sum = " + Calculus.sum(5,17));        // sum metodunu Calculus class Line 5-6 da olusturduk.
        System.out.println("Subtract = " + Calculus.subtract(10,3));
        System.out.println("SubtractAbs = " + Calculus.subtractAbs(3,10));
        System.out.println("Multiply = " + Calculus.multiply(7,32));
        System.out.println("Divide = " + Calculus.divide(32,7));       // b sifir olursa problem oldugundan if statement kullandik

    }
}
