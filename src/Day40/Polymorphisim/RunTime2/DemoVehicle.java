package Day40.Polymorphisim.RunTime2;

public class DemoVehicle {

    public static void main(String[] args) {

        // RunTime Polymorphism
        // We achieve this using method overriding

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new SportCar();
        Vehicle vehicle3 = new Truck();

        System.out.println(vehicle1.speedUpTo60()); // Vehicle is speeding up...
        System.out.println(vehicle2.speedUpTo60()); // SportCar is speeding up...
        System.out.println(vehicle3.speedUpTo60()); // Truck is speeding up...

    }

}
