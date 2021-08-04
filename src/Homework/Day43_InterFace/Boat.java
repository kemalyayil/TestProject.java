package Homework.Day43_InterFace;

public class Boat implements Sailing,Vehicle{
    @Override
    public void sail() {
        System.out.println("A bot can sail in oceans.");
    }

    @Override
    public void speed() {
        System.out.println("A bot might not be very fast!!!");
    }
}
