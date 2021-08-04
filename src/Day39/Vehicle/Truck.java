package Day39.Vehicle;

public class Truck extends Vehicle{

    public Truck(String make, String model){
        super(make, model);
    }

    @Override
    public void speedUpTo60() {
        System.out.println("Truck is speeding up to 60 in 11 seconds");
    }

    @Override
    public void breakDownFrom60(){
        System.out.println("Truck breaks in 14 second");
    }
}
