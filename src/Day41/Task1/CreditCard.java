package Day41.Task1;

public class CreditCard extends BankCard{



    public CreditCard(String name, int SSN){
        super(name, SSN);
    }



    @Override
    public void deposit(double moneyToDeposit) {
        if (moneyToDeposit <= 0){
            throw new IllegalArgumentException("Invalid Entry");
        }
        setBalance(getBalance() + moneyToDeposit);
    }

    @Override
    public void withdraw(double moneyToWithdraw) {
        setBalance(getBalance() - moneyToWithdraw);
    }
}
