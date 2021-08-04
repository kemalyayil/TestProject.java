package Day37.EncapsulationTask;

public class DemoBankAccount {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("321312",Currency.USD);

        System.out.println("UserID: " + bankAccount.getUserID());
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Currency: " + bankAccount.getCurrency());

        bankAccount.deposit(900);
        System.out.println("Balance after Deposit: " + bankAccount.getBalance());
        bankAccount.withdraw(30);
        System.out.println("Balance after Withdraw: " + bankAccount.getBalance());

        bankAccount.withdraw(900);
        System.out.println("Balance after Withdraw: " + bankAccount.getBalance());

    }

}



