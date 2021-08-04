package Day11;

public class _02_LogicalOperator {
    public static void main(String[] args) {

        int temp = 24;
        boolean isHot = temp > 30;
        boolean isGood = temp > 23 && temp < 30; //  "and" operator
        System.out.println(isHot);
        System.out.println(isGood);

        boolean hasHighIncome = false;
        boolean hasGoodCreditScore = true;
        boolean eligible = hasHighIncome || hasGoodCreditScore; // "||" or statement // ikisinden biri + ise sonuc true olur
        System.out.println("eligible = " + eligible);



    }
}
