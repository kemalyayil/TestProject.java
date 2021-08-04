package Day18;

public class _03_Task {
    public static void main(String[] args) {
        // create a method that takes two numbers and prints out their sum.

        sumNumbers (9,10);
    }
    public static void sumNumbers(Integer firstNumber,Integer secondNumber) {
        int sum = firstNumber + secondNumber;       // bu daha acik olsun diye
        System.out.println("sum" + " " + sum ); // System.out.println("sum" + " " + (firstNumber + secondNumber) );
    }

}

