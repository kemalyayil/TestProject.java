package Homework.Day41;

public abstract class Food {
    private String name;


    public Food(String name) {
        this.name = name;

    }

    public abstract void madeIn(String countryName);
    public abstract void taste(String taste);
    public abstract void getCaloriesPerPortion(int caloriesPerPortion);
}
