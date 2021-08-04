package Day37.EncapsulationTask.Task1Pack;

public class Account {

    private String userID;
    private double balance;


    public Account(String userID){
        this.userID = userID;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0){
            throw new IllegalArgumentException("Balance can not be less than or equal to zero");
        }
        this.balance = balance;
    }

    public String getUserID(){
        return userID;   //*requirement userId must not be modified, it's a read-only property dedigi icin
    }





}
