package Day41.VehiclePack;

public abstract class Vehicle {
    // abstract key word only for methods and classes.
   // abstract int productionDate;

    public void test(){                     // we can have both abstract or non-abstract (normal) methods
        System.out.println("Test");
    }


    public abstract void move(int distance);
    public abstract void move(int distance, String unit);       // we can overload the methods. (unit is km)
    public abstract void fuelUp(int liters);





}
