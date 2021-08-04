package Day42.CarPackage;

public class Tesla extends Car implements Elektric{

    public Tesla(String model, int productionYear){
        super(model, productionYear);
    }

    @Override
    public void changeBattery() {
        System.out.println("Change battery every 100 000 miles!");
    }
}
