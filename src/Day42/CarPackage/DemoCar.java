package Day42.CarPackage;

public class DemoCar {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("E350",2012);
        System.out.println(mercedes.getModel());
        System.out.println(mercedes.getProductionYear());
        mercedes.changeOil();


        System.out.println("========================================");
        Tesla tesla = new Tesla("S", 2020);
        System.out.println(tesla.getModel());
        System.out.println(tesla.getProductionYear());
        tesla.changeBattery();


        System.out.println("========================================");
        ToyotaPrius toyotaPrius = new ToyotaPrius("PriusV",2021);
        System.out.println(toyotaPrius.getModel());
        System.out.println(toyotaPrius.getProductionYear());
        toyotaPrius.changeBattery();
        toyotaPrius.changeOil();




    }
}
