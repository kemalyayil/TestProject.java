package Day32;

public class MainBankAccount {
    public static void main(String[] args) {
        // constructor is method to initialize field for objects.

        BankAccount customer = new BankAccount();     // bunu sonradan yaptik. bankaccount class line 14-15.
                                                  // bu oldugu zaman parametre istemeyeck. cunku parametresiz oldugu icin.


        BankAccount customer1 = new BankAccount("John", 123456789);   // buaradaki ssn kullanmazsak , hata verir
//        customer1.customerName = "John";              // bunlara gerek yok eger constructor methodu kullanirsak
//        customer1.ssn = 123456789;
        customer1.deposit(10000);

        System.out.println("Customer 1 = "+customer1.customerName);
        System.out.println(customer1.ssn);
        System.out.println(customer1.customerBalance);

        BankAccount customer2 = new BankAccount("Mark", 987654321,"Brooklyn");
        System.out.println("Customer 2 = "+ customer2.customerName);
        System.out.println(customer2.ssn);
        System.out.println(customer2.city);

    }


}
