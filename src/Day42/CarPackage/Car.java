package Day42.CarPackage;

public class Car {

    private String model;
    private int productionYear;

    public Car(String model, int productionYear){
        setModel(model);
        setProductionYear(productionYear);
    }




    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    private void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }





}
