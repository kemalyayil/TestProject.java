package Day15;

public class _01_WhileLoop {
    public static void main(String[] args) {
        // for loop
        for ( int i = 1; i <= 5 ; i++){   // for loop ne kadar yazdircagin belli.
            System.out.println("Hello World" + i);
        }
        System.out.println("");

        int counter = 1;            // while da ne kadar iterate edildigini bilmiyoruz.
        while (counter <= 5){
            System.out.println("Hello World" + counter);
            counter++;

        }
    }
}
