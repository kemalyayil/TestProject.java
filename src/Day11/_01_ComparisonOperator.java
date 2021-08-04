package Day11;

public class _01_ComparisonOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 2;

        System.out.println("Equal");
        System.out.println(a==b);
        System.out.println(a==c);

        System.out.println("Not Equal");
        System.out.println(a != b); // if these are not equal? answer is false. cuz they re same
        System.out.println(a != c); // burada true sonucu cikiyor.. cunku onlar notEqual.

        System.out.println("Greater than");
        System.out.println(a > b);
        System.out.println(c > a);

        System.out.println("Less than");
        System.out.println(a < b);
        System.out.println(a < c);

        System.out.println("Greater than or equal");
        System.out.println(a >= b);
        System.out.println(a >= c);

        System.out.println("Less than or equal");
        System.out.println(a <= b);
        System.out.println(a <= c);

        boolean aLessThanC = a < c; // boolean da store edebiliriz.
        System.out.println(aLessThanC);





    }
}
