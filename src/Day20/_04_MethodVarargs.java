package Day20;

public class _04_MethodVarargs {
    public static void main(String[] args) {
        calculateStock("Pen",300,555,100); // varargs lari topladik


    }
    public static void calculateStock (String productName, int... numberOfStock){ // numberOfStock=varargs


        int stockOfProducts = 0;

        for (int i = 0; i < numberOfStock.length; i++){
            stockOfProducts += numberOfStock[i];

        }
        System.out.println("We have " + stockOfProducts + " "+ productName + " in stock !");
    }
}
