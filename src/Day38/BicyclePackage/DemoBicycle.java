package Day38.BicyclePackage;

public class DemoBicycle {
    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(24,20,10);
        mountainBike.speedUp(4);
        System.out.println("speed after speedUp             = "+mountainBike.speed);

        mountainBike.applyBreak(12);
        System.out.println("speed after Brake               = "+mountainBike.speed);

        System.out.println("Gear for mountain bike          = "+ mountainBike.gear);
        System.out.println("SeatHeight for mountain bike    = "+ mountainBike.seatHeight);


        System.out.println(" ");

        RaceBike raceBike = new RaceBike(32,30,8);
        raceBike.speedUp(7);
        System.out.println("Speed after speedUp     = " + raceBike.speed);

        raceBike.applyBreak(3);
        System.out.println("Speed after break       = " + raceBike.speed);

        System.out.println("Gear for Race bike      = " + raceBike.gear);
        System.out.println("WheelSize for Race bike = " + raceBike.wheelSize);

        System.out.println(" ");

        KidsBike kidsBike = new KidsBike(1,5,4);
        kidsBike.speedUp(3);
        System.out.println("Speed after speedUp     = " + kidsBike.speed);

        kidsBike.applyBreak(6);
        System.out.println("Speed after break       = " + kidsBike.speed);

        System.out.println("Gear for kidsBike       = " + kidsBike.gear);
        System.out.println("Number of Wheels for kids bike = " + kidsBike.numberOfWheels);
    }
}
