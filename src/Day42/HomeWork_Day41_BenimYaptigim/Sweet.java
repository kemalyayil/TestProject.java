package Day42.HomeWork_Day41_BenimYaptigim;

public abstract class Sweet extends Food {

    public Sweet(String name){
        super(name);
    }

    @Override
    public  void madeIn(String countryName){
        System.out.println ("Traditional Sweet Food of  " + countryName);
    }



    @Override
    public  void taste(String taste){
        System.out.println("The menu that you have selected has " + taste + "flavors");
    }
}
