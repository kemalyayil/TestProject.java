package Day41.VehiclePack;

public class Truck extends Vehicle{
    @Override
    public void move(int distance){
        System.out.println("Truck will move " + distance);
    }

    @Override
    public void move(int distance, String unit) {
        System.out.println("Truck will move " + distance + " " + unit);
    }

    @Override
    public void fuelUp(int liters) {
        System.out.println("Truck will fuel up " + liters + " liters!");
    }


}
