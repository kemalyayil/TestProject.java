package Day20;

public class _02_MethodVarargs {
    public static void main(String[] args) {

        System.out.println(sum(2,3,4,5,6,7,8,8));
        System.out.println(sum(666666669,999999999));


    }
    public static int sum ( int a,int b){  // that will take only 2 parameters. for more par. we need to create
        return a +b;                        // more as long as you needed.

    }

    public static int sum (int... varargs){ // this will take as much number as you want
        int sum = 0;
        for (int i = 0; i < varargs.length; i++){
            sum += varargs[i];
        }
        return sum;

    }
}
