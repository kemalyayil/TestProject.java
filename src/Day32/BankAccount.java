package Day32;

public class BankAccount {
    // aslinda line 21 deki constructor metotumuz olmasa bile her class in default constructor i vardir.
    // dolayisi ile main method da cagrildigi zaman print edecektir: null , zero vs olarak.
    // ama main methodda int x ; yazarsak deger vermeden, sout ile yazdirmak istedigimizde hata verir.

    String customerName;
    int ssn;
    String city;
    double customerBalance ;
    static double banksBalance;

    //NoArgs constructor
    public  BankAccount() {             // main method da parametre gerektirmesin diye bunu sonradan yaptik.cunku digerlerinde
        this.customerName = "Not initialized";  // parametre vardi. ve data girmek durumundaydik digerlerinde(line 21 & 26)
    }

    //Constructor method unu kullanacagiz. main method da parametreleri kullanip kolayca cagirmak icin.
    //Parameterized Constructor deniyor asagidakine (line 21).
    public  BankAccount(String customerName , int ssn){          // constructor name should be same with the class name. line 3
       this.customerName = customerName;
       this.ssn= ssn;
    }

    public BankAccount(String customerName, int ssn, String city){     // overloaded constructor with a new constructor
        this.customerName = customerName;
        this.ssn= ssn;
        this.city = city;
    }

  public void deposit( double moneyToDeposit){
      customerBalance += moneyToDeposit;
      banksBalance += moneyToDeposit;

  }

    public void withdraw(double moneyToWithdraw) {
      customerBalance -= moneyToWithdraw;

        banksBalance -=moneyToWithdraw;

        /*
                                Method Vs Constructor
                    -Constructor will have the same name with classname
                    -Method can have any name

                    -Constructor must not have a return type
                    -Method must have a return type even it's void

                    -Constructor will be created automatically by Java ( default constructor
                    -Method will not be created automatically

                    -We use Constructor to initialize instances of an object
                    -We use Method to perform action (it's a function )
        */


    }
}
