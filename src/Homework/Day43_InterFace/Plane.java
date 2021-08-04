package Homework.Day43_InterFace;

public class Plane implements Flying,Vehicle{

    @Override
    public void fly() {
        System.out.println("Planes can fly !!!");
    }

    @Override
    public void speed() {
        System.out.println("Planes are flowing really fast in the sky!!!");
    }
}
