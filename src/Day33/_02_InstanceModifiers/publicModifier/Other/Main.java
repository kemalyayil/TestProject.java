package Day33._02_InstanceModifiers.publicModifier.Other;

import Day33._02_InstanceModifiers.publicModifier.Same.Car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Ford");

        car.getName();

        String name = car.name;

    }

}
