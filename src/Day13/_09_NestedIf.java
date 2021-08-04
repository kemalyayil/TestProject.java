package Day13;

public class _09_NestedIf {
    public static void main(String[] args) {

        boolean condition1 = true;
        boolean condition2 = true;

        if (condition1) {
            if (condition2) {
                System.out.println("Condition2 is true");
            } else {
                System.out.println("Condition1 is true");
            }
        }else {
            System.out.println("No condition is true");


        }

    }
}
