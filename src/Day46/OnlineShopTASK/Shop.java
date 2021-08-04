package Day46.OnlineShopTASK;

public class Shop {
    public static void main(String[] args) {

        Customer customer1 = new NormalCustomer("John", "New York,US");
        Item item1 = new Item("Pasta",10.99);
        customer1.addItemToCart(item1);
        //customer1.addItemToCart(new Item("Pasta",10.99));    // bu sekilde de yazabiliriz

        customer1.addItemToCart(new Item("Foam",5));
        customer1.addItemToCart(new Item("Tv",599.90));

        customer1.removeItemFromCart(item1);

        double cartTotal = customer1.getCartTotal();

        String customerInfo = customer1.toString();
        System.out.println("customerInfo = " + customerInfo);
        System.out.println("CartTotal = " + cartTotal);

        System.out.println("========================================================");

        Customer customer2 = new SpecialCustomer("Emily","Florida");
        customer2.addItemToCart(new Item("Airpods", 249.99));
        customer2.addItemToCart(new Item("Bread", 2.59));
        customer2.addItemToCart(new Item("Yoghurt", 7.15));


        String customerInfo2 = customer2.toString();
        double cartTotal1 = customer2.getCartTotal();

        System.out.println(customerInfo2);
        System.out.println(cartTotal1);

    }
}
