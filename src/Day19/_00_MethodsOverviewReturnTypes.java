package Day19;

public class _00_MethodsOverviewReturnTypes {
    public static void main(String[] args) {

        sumOfThreeDouble(3,4,6.9);

        int[] array = new int[sumOfThreeIntegers(1, 5, 9)];

        System.out.println(array.length);

    }



    // this method will return sum of three integers
    public static int sumOfThreeIntegers(int i1, int i2, int i3){

        int result = i1 + i2 + i3;

        return result;
    }



    // this method will sum three doubles and print the result
    public static void sumOfThreeDouble(double d1, double d2, double d3){

        double result = d1 + d2 + d3;

        System.out.println(result);

    }


}
