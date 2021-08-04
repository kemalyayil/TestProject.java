package Homework.Day43_InterFace;

public class DemoVehicle {
    public static void main(String[] args) {
        Boat boat = new Boat();
        boat.speed();
        boat.sail();


        System.out.println("==================");
        Car car = new Car();
        car.speed();


        System.out.println("==================");
        Plane plane = new Plane();
        plane.fly();
        plane.speed();


        System.out.println("==================");
        Train train = new Train();
        train.speed();

        System.out.println("==================");
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.fly();
        spaceShip.sail();
        spaceShip.speed();

    }
}
