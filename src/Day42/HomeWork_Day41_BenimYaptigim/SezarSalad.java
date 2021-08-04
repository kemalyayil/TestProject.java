package Day42.HomeWork_Day41_BenimYaptigim;

public class SezarSalad extends Salad {

    public int caloriesPerPortion;

    public SezarSalad(String name) {
        super(name);
    }

    @Override
    public void madeIn(String countryName) {
        System.out.println("That Cesar Salad is made in " + countryName);
    }

    @Override
    public void taste(String taste) {
        System.out.println("Taste of this product is " + taste);

    }

    @Override
    public void getCaloriesPerPortion(int caloriesPerPortion) {
        System.out.println("This type of Cesar Salad has " + caloriesPerPortion + " calories per portion.");
    }
}
