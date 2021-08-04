package Day11;

public class Deneme {
    public static void main(String[] args) {
        boolean hasHighIncome = false;
        boolean hasGoodCreditScore = true;
        boolean eligible = hasHighIncome || hasGoodCreditScore;
        System.out.println("eligible = " + eligible);
    }
}
