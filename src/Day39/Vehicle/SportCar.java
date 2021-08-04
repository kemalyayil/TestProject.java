package Day39.Vehicle;

public class SportCar extends Vehicle{

    public SportCar(String make, String model){
        super(make, model);
    }
    @Override
    public void speedUpTo60(){
        System.out.println("Sport car is speeding up to 60 mile in 3 seconds");
    }
    @Override
    public void breakDownFrom60(){
        System.out.println("Sportcar is breaking in 5 seconds");
    }
}
