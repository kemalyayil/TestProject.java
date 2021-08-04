package Day33._01_Package.PackageTwo;

import Day33._01_Package.PackageOne.*; // import everything from package

public class Main {

    Car car = new Car("Toyota");

    Truck truck = new Truck();

    // not available because it is a package-private class, the access modifier is default
//    Plane plane = new Plane();


}
