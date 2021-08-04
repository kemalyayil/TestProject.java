package Day34.Enums3;

public class Main {
    public static void main(String[] args) {
        Directions direction1 = Directions.EAST;
        direction1.distance = 5;

        System.out.println(direction1);
        System.out.println(direction1.shortName);
        System.out.println(direction1.distance);

        direction1.distance = 3; // bu sekilde update edebiliriz cunku final deil. Direction Class line 11
        //direction1.shortName="EA" // diye degistiremeyiz cunku final
    }
}
