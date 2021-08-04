package Day40.Polymorphisim.CompileTime;


import Day40.Polymorphisim.CompileTime.DemoCalculation;
public class DemoCalculation {
    public static void main(String[] args) {
        // compile time polymorphism;
        // we achieve this by using method overloading.
        Calculation.add(3,8);
        Calculation.add(4.3,8.9);
        Calculation.add(1,75,12);
        Calculation.add(3.3,14.7,33.0);




    }
}
