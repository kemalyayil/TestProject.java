package Day31.StaticTask3;

public class MainBankAccount {
    public static void main(String[] args) {
        System.out.println("Bank's Money = " + BankAccount.banksBalance);

        BankAccount customer1 = new BankAccount();
        customer1.customerName = "Kemal";
        //customer1.customerBalance = 10000;

        //System.out.println("Customer Balance=" + customer1.customerBalance);
        customer1.deposit(30000);
        System.out.println("Customer Balance after deposit=" + customer1.customerBalance);
        customer1.withdraw(4755);
        System.out.println("Customer Balance after withdraw=" + customer1.customerBalance);
        System.out.println("Bank's Money after Kemal= " + BankAccount.banksBalance);



        BankAccount customer2 = new BankAccount();
        customer2.customerName = "Hafid";
        //customer2.customerBalance = 10_000_000;

        //System.out.println("Customer2 Balance=" + customer2.customerBalance);
        customer2.deposit(7644322);
        System.out.println("Customer2 Balance after deposit=" + customer2.customerBalance);
        customer2.withdraw(98321);
        System.out.println("Customer2 Balance after withdraw=" + customer2.customerBalance);
        System.out.println("Bank's Money after Hafid= " + BankAccount.banksBalance);



        //Part 2
        System.out.println("Bank has = " + BankAccount.banksBalance);


    }


}
