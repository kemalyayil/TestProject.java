package Day20;

public class _03_MethodVarargs2 {
    public static void main(String[] args) {
        System.out.println(sum(5.6,6,7,3,2,1));

    }

    public static double sum ( double a, int ... varargs){ // varargs should be always at the end
        double sum = a;  // = a dedik cunku sifir yazarsak int olanlari toplar
        for (int i = 0; i < varargs.length; i++){
            sum += varargs[i];
        }
        return sum;
    }

}
