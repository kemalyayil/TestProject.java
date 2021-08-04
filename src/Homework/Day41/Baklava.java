package Homework.Day41;

public class Baklava extends Sweet{

    public int caloriesPerPortion;

    public Baklava (String name){
        super(name);
    }

    @Override
    public  void madeIn(String countryName){
        System.out.println("That Baklava is made in " + countryName);
    }

    @Override
    public void taste(String taste) {
        System.out.println("Taste of this product is " + taste);

    }
    @Override
    public  void getCaloriesPerPortion(int caloriesPerPortion){
        System.out.println("This type of baklava has " + caloriesPerPortion + " calories per portion.");
    }

}
