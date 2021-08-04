package Day34;

public class _01_FinalKeyWord {
    public static void main(String[] args) {

        Car car1 = new Car(2010);
        car1.name = "BMW";

        System.out.println(car1.year);
        System.out.println(car1.name);

        car1.name = "BMW 520i";        // burada name degistirmek istersek degisir. cunku final demedik car class ta.
        System.out.println(car1.name);

        //car1.year = 2015;            // bunu degistiremeyiz. cunku carClass line 6 da final dedik.

    }
}
