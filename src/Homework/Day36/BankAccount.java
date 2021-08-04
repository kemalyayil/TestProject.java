package Homework.Day36;

public class BankAccount {
    private String userId;
    private double balance;
    private Currency currency;


    protected BankAccount(String userId, Currency currency) {
        this.userId = userId;
        this.currency = currency;
    }

    private double withdrawMoney(double balance, double moneyAmount) {
        if (balance < moneyAmount) {
            throw new IllegalArgumentException("You should not be able to withdraw more than your balance");
        }
        this.balance = balance;
        return (balance - moneyAmount);
    }

    private double deposit(double balance, double moneyAmountToBeDeposited) {
        return (balance + moneyAmountToBeDeposited);
    }


}
