package Day42.HomeWork_Day41_BenimYaptigim;

public abstract class Salad extends Food {

    public Salad(String name){
        super(name);
    }

    @Override
    public abstract void madeIn(String countryName);

    @Override
    public abstract void taste(String taste) ;
}
