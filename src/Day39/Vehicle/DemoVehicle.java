package Day39.Vehicle;

public class DemoVehicle {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar("Ford", "Mutang");
        sportCar.speedUpTo60();
        sportCar.breakDownFrom60();


        Truck truck = new Truck("Ford","F150");
        truck.speedUpTo60();
        truck.breakDownFrom60();
    }
}
