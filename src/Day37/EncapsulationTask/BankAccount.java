package Day37.EncapsulationTask;

public class BankAccount {

    private String userID;
    private double balance;
    private Currency currency;



    public BankAccount (String userID , Currency currency){
        this.userID = userID;
        this.currency = currency;
    }

    public String getUserID() {
        return userID;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void deposit(double depositMoney){
        if (depositMoney <= 0)
            throw new IllegalArgumentException("You cannot deposit 0 or less money");
            balance += depositMoney;
    }

    public void withdraw(double withdrawMoney){
        if (withdrawMoney <= 0)
            throw  new IllegalArgumentException("Withdraw money cannot be less than 0.");

        if(balance - withdrawMoney < 0)
            throw new IllegalArgumentException("Not enough money to withdraw");
        balance -= withdrawMoney;
    }
}
