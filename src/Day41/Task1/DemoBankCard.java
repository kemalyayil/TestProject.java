package Day41.Task1;

public class DemoBankCard {
    public static void main(String[] args) {

    DebitCard debitCard = new DebitCard("John",1233556);
    debitCard.deposit(550);
//    debitCard.withdraw(700);          // will throw an exception



    CreditCard creditCard = new CreditCard("Mike",847464633);
    creditCard.deposit(4000);
    creditCard.withdraw(4001);
    System.out.println(creditCard.getBalance());

    }
}
