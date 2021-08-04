package Day30;

public class MainCar {

    public static void main(String[] args) {

        //Car.numberOfCars;  // burada bunu alabiliyoruz.
        // Car.name ;           // alamiyoruz. cunku object.


        // classes have 2 variables : instance and static.

        Car car1 = new Car();      // instance variables for the objects. car1 sinifi uretmeden name ve color gelmez.
        car1.addToInventory("Mercedes","Black");
        Car.PrintNumberOfCars();

        Car car2 = new Car();
        car2.addToInventory("BMW","Blue");
        Car.PrintNumberOfCars();  // static variables are not objects. they are shared among the classes
                                    // car1 yazip bu methodu alamiyoruz. cunku static. Car class i icin kullanabiliyoruz
                                    // Car class line 18 and 19



    }
}
