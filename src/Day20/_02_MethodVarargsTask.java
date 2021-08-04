package Day20;

public class _02_MethodVarargsTask {
    public static void main(String[] args) {
        System.out.println(multiply(1.2,4.5,6.7)); // buraya yazilanlar ic kisimda array a cevirir ve store eder.

        //        Jvm stores all arguments inside an array
        //        double[] array = {1, 5.9, 9.4};
    }

    public static double multiply(double... varargs) {
        double sum = 1;
        for (int i = 0; i < varargs.length; i++) {
            sum *= varargs[i];
        }
        return sum;
    }
}
