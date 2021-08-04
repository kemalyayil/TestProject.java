package Day42.HomeWork_Day41_BenimYaptigim;

public class DemoFood {
    public static void main(String[] args) {

        Food baklava = new Baklava("HavucDilimi");
        baklava.taste("Sweet");
        baklava.madeIn("Turkey / Antep");
        baklava.getCaloriesPerPortion(100);

        System.out.println(" ");
        Sweet cheeseCake = new CheeseCake("CheeseCake Oreo (with cookies)");
        cheeseCake.taste("Sweet");
        cheeseCake.madeIn("USA");
        cheeseCake.getCaloriesPerPortion(120);

        System.out.println(" ");
        Salad greekSalad = new GreekSalad("Greek Salad");
        greekSalad.taste("Salty and Sour");
        greekSalad.madeIn("Greece");
        greekSalad.getCaloriesPerPortion(50);

        System.out.println(" ");
        Food cezarSalad = new SezarSalad("Cezar Salad");
        cezarSalad.taste("Salty and Sour");
        cezarSalad.madeIn("Mediterranean");
        cezarSalad.getCaloriesPerPortion(55);

    }
}
