package Day46.OnlineShopTASK;

public class Item {
    private String itemName;
    private double itemPrice;


    public Item(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {

        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
