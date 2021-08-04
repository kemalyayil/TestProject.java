package Day14;

public class _01_ForLoops {
    public static void main(String[] args) {

        for ( int i = 0; i < 5 ; i++){
            System.out.println("Hello World");
        }
        System.out.println(" ");
        for ( int i = 1; i <= 5 ; i++){ // both are same thing
            System.out.println("Hello World");
        }

        for ( int i = 1; i <= 5 ; i++){
            System.out.println("Hello World" + i); // bu sekilde numara veriyor. 1 den 5 e
        }


        System.out.println(" ");
        for (int j = 5; j >= 1; j--) {
            System.out.println("Hello World! " + j); // bu sekilde 5 ten 1 e numara veriyor
        }

        //for ( int i = 1; i ==1 ; i++){ // infinite printing. cuz it is checking if i = 1.
          //  System.out.println("Hello World" + i);
        }
    }

