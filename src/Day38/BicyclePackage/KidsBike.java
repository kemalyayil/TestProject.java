package Day38.BicyclePackage;

public class KidsBike extends Bicycle{

    int numberOfWheels;

    public KidsBike(int gear, int speed, int numberOfWheels){
        super(gear, speed);
        this.numberOfWheels = numberOfWheels;
    }

}
