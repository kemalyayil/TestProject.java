package Warmup.Warmup1;

public class Warmup9_intMax {
    /*
    Given three int values, a b c, return the largest.
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
     */
    public static void main(String[] args) {
        System.out.println(max(100,3,2));

    }
    public static int max(int a , int b, int c){
        int max = 0;
        if(a>b){
            max = a;
        } else{
            max = b;
        }
        if (max<c){
            max=c;
        }
        return max;
    }
}
