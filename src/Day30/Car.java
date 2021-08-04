package Day30;

public class Car {

    String name;
    String color ;

    static int numberOfCars;   // basa static yazdik. class larda bize opsiyon cikartacak.


    public void addToInventory(String name, String color){
        this.name = name;           // "this" refers to instance of that class.line 5
        this.color = color;
        numberOfCars++;

    }

    public static void PrintNumberOfCars(){
        System.out.println("Number of Cars : " + numberOfCars);
    }
    /*
    To access instance variables and methods
    we should create an object
    Car car = new Car();
    car.name;
    car.color;
        car.addToInventory();
        */

}
