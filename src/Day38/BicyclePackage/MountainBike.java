package Day38.BicyclePackage;

public class MountainBike extends Bicycle{


    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

}
