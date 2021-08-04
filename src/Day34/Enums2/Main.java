package Day34.Enums2;

public class Main {

    public static void main(String[] args) {

        //Level level = Level.Low;

        //WaterLevel boiler = new WaterLevel(Level.Low);      // ama burayi "High" yaparsak will print it.
        WaterLevel boiler = new WaterLevel(Level.High);

//        if (boiler.getLevel() == Level.High){
//            System.out.println("Water level is high");      // bu sekilde print etmiycek.
//        }

        switch (boiler.getLevel()){
            case Low:
                System.out.println("Water level is low");
                break;
            case Medium:
                System.out.println("Water level is medium");
                System.out.println("Thats good!");
                break;
            case High:
                System.out.println("Water level is High");
                System.out.println("Warning");
                break;
            default:        // if these cases(ELSE) are not true, then default will be excecuted.
                System.out.println("The level is not recognized");
        }
    }
}
