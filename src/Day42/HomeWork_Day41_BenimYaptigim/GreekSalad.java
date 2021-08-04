package Day42.HomeWork_Day41_BenimYaptigim;

public  class GreekSalad extends Salad {

    public int caloriesPerPortion;
    public GreekSalad (String name){
        super(name);
    }

    @Override
    public  void madeIn(String countryName){
        System.out.println("That Greek Salad is made in " + countryName);
    }

    @Override
    public void taste(String taste) {
        System.out.println("Taste of this product is " + taste);

    }
    @Override
    public  void getCaloriesPerPortion(int caloriesPerPortion){
        System.out.println("This type of Greek Salad has " + caloriesPerPortion + " calories per portion.");
    }
}
