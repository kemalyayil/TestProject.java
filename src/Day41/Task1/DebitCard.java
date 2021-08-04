package Day41.Task1;

public class DebitCard extends  BankCard {

    public DebitCard(String name, int SSN){
        super(name, SSN);
    }

    @Override
    public void deposit(double moneyToDeposit) {
        if (moneyToDeposit <= 0 )
            throw new IllegalArgumentException("This is not a valid entry!!");
        setBalance(getBalance() + moneyToDeposit);
    }

    @Override
    public void withdraw(double moneyToWithdraw) {
        if (moneyToWithdraw <= 0){
            throw new IllegalArgumentException("This is not a valid entry!!");
        }
        if (getBalance() - moneyToWithdraw < 0){
            throw new IllegalArgumentException("You can not withdraw more than you have");
        }

        setBalance(getBalance() - moneyToWithdraw);
    }
}
