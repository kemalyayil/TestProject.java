package Day38.BicyclePackage;

public class Bicycle {

    int gear;
    int speed;


    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }


    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

}
