package Day41.VehiclePack;

public class DemoVehicle {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.move(50);
        car.move(50, "miles");
        car.fuelUp(40);


        Vehicle truck = new Truck();
        truck.move(150);
        truck.move(300, "miles");
        truck.fuelUp(85);
    }
}
