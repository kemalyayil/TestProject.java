package Day42.HomeWork_Day41_BenimYaptigim;

public  class CheeseCake extends Sweet {

    public int caloriesPerPortion;
    public CheeseCake (String name){
        super(name);
    }

    @Override
    public  void madeIn(String countryName){
        System.out.println("That CheeseCake is made in " + countryName);
    }

    @Override
    public void taste(String taste) {
        System.out.println("Taste of this product is " + taste);

    }
    @Override
    public  void getCaloriesPerPortion(int caloriesPerPortion){
        System.out.println("This type of CheeseCake has " + caloriesPerPortion + " calories per portion.");
    }
}
