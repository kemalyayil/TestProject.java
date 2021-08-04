package Day42.CarPackage;

public class ToyotaPrius extends Car implements Elektric,Diesel{   /// ikisinide(interfece) yazdik implement yazdiktan sonra.

    public ToyotaPrius(String model, int productionYear){
        super(model, productionYear);
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 25 000 miles!");
    }

    @Override
    public void changeBattery() {
        System.out.println("Change battery ever 40 000 miles!");
    }
}
