package Day41.Task1;

public abstract class BankCard {
    private String name;
    private int SSN;
    private double balance;


    public BankCard(String name,int SSN){
        this.name = name;
        this.SSN = SSN;
    }

    public abstract void deposit(double moneyToDeposit);
    public abstract void withdraw(double moneyToWithdraw);


    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
