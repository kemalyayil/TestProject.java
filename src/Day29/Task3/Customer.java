package Day29.Task3;

public class Customer {

    String name;
    ElectricityAccount electricityAccount;              // bunu integrate etmedigim icin sikinti cekmisim


    public void consumeElectricity(int wph) {
        if (wph < 0) {                      // bunu eksi yazildiginda yazdirmasin diye yapdik
            return;
        }
        electricityAccount.totalWph += wph;

    }
}

