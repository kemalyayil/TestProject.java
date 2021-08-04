package Day46.OnlineShopTASK;

public class PremiumCustomer extends Customer{
    public PremiumCustomer(String customerName, String customerAddress){
        super(customerName, customerAddress);
    }

    @Override
    public double getCartTotal() {
        double sum = 0;
        for (Item item : getCart()){
            sum += item.getItemPrice();
        }
        return sum * 0.9;
    }
}
