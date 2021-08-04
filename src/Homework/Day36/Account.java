package Homework.Day36;

public class Account {
    private String userId;
    private double balance;

    protected Account(String userId){
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0){
            throw new IllegalArgumentException("The balance cannot be equal or less than 0");
        }
        this.balance = balance;
    }




}
