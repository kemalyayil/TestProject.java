package Day31.StaticTask3;

public class BankAccount {

    String customerName;
    double customerBalance ;

    static double banksBalance;

  public void deposit( double moneyToDeposit){
      customerBalance += moneyToDeposit;

      banksBalance += moneyToDeposit;


  }

    public void withdraw(double moneyToWithdraw) {
      customerBalance -= moneyToWithdraw;

        banksBalance -=moneyToWithdraw;



    }
}
