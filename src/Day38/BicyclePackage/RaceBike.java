package Day38.BicyclePackage;

public class RaceBike extends Bicycle{      // once kirmizi cizgili oldu. cunku default constructor olmadigi icin
                                            // bu sayfada line 7 deki constructor dan sonra kayboldu
    int wheelSize;

    public RaceBike(int gear, int speed, int wheelSize){
        super(gear, speed);                // to call constructor.
//        super.gear;             // to call field from parent
//        super.speedUp();        // call method from parent class
        this.wheelSize = wheelSize;
    }

}
