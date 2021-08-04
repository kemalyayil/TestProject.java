package Day29.Task3;

public class ElectricityAccount {

    int totalWph;
    double rate = 0.7;
    double bill;


    //Part 3
    public double calculateBill() {
        bill = rate * totalWph;
        return bill;
    }

}


