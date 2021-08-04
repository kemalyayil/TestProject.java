package Homework.Day43_InterFace;

public class SpaceShip implements Vehicle,Flying,Sailing{

    @Override
    public void speed() {
        System.out.println("A space ship is a very fast vehicle");
    }

    @Override
    public void fly() {
        System.out.println("A space ship can fly to the moon");
    }

    @Override
    public void sail() {
        System.out.println("A space ship can not sail in oceans");
    }

}
