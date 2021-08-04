package Day29.Task3;

public class MainElectricity {
    public static void main(String[] args) {

//        Customer customer1 = new Customer();
//        customer1.name = "John";
//        customer1.electricityAccount = new ElectricityAccount();     // bu degisik bi class oldugu icin vede customer line 6 den aldik
//        customer1.electricityAccount.totalWph = 100;

//        System.out.println(customer1.name);
//        System.out.println(customer1.electricityAccount.totalWph);
//        System.out.println(customer1.electricityAccount.rate);
//        System.out.println(customer1.electricityAccount.bill);



        Customer customerMike = createCustomer("Mike");
        System.out.println(customerMike.name);
        System.out.println(customerMike.electricityAccount.totalWph);
        System.out.println(customerMike.electricityAccount.bill);
        System.out.println(customerMike.electricityAccount.rate);


        // part 2
        customerMike.consumeElectricity(100);
        customerMike.consumeElectricity(200);
        customerMike.consumeElectricity(45);
        customerMike.consumeElectricity(88);

        System.out.println("Total wph  = " + customerMike.electricityAccount.totalWph);

        double finalBill = customerMike.electricityAccount.calculateBill();
        System.out.println("Final bill = " + finalBill);



    }
    public static Customer createCustomer(String name){
        Customer customer = new Customer();
        customer.name = name;
        customer.electricityAccount = new ElectricityAccount();
        return customer;
    }
}
