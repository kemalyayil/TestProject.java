package Day42.HomeWork_Day41_Edited;

public abstract class Salad extends Food{

    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("Salty, sour");
    }
}
