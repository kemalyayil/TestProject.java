package Homework.Day41;

public abstract class Salad extends Food{

    public Salad(String name){
        super(name);
    }

    @Override
    public abstract void madeIn(String countryName);

    @Override
    public abstract void taste(String taste) ;
}
