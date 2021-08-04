package Day46.OnlineShopTASK;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {


    private String customerName;
    private String customerAddress;
    private List<Item> cart = new ArrayList<>();

    public Customer(String customerName,String customerAddress){
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }


    public void addItemToCart(Item item){
        this.cart.add(item);
    }

    public void removeItemFromCart(Item item){
        this.cart.remove(item);
    }

    public String getCustomerName() {
        return customerName;
    }
    public String setCustomerName(String customerName) {
        return this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return this.customerAddress;
    }

    public String setCustomerAddress(String customerAddress) {
        return this.customerAddress = customerAddress;
    }

    public List<Item> getCart(){
        return this.cart;
    }

    public abstract double getCartTotal();


    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", cart=" + cart +
                '}';
    }
}



