package Homework.Day40;

public class DemoAccount {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("123");

        bankAccount.deposit(10000);
        System.out.println("After deposit: " + bankAccount.getBalance());

//        bankAccount.withdraw(13000);
//        System.out.println("After withdraw: " + bankAccount.getBalance());


//        BankAccount privilegedAccount = new PrivilegedAccount("321");
//
//        privilegedAccount.deposit(10000);
//        System.out.println("After deposit: " + privilegedAccount.getBalance());
//
//        privilegedAccount.withdraw(13000);
//        System.out.println("After withdraw: " + privilegedAccount.getBalance());

    }

}
