package Day41._0_ReferanceVariables;

public class DemoClass {
    public static void main(String[] args) {

        // only possible way to access a variable through reference variables
        // primitive data types dont have classes. thats why they dont have any methods. that s why we have wrapper classes. that
// these are called reference variables


        Square square = new Square();
        Rectangle square2 = new Square();       // every square is rectangle
        Shape square3 = new Square();           // every square is shape
        Object square4 = new Square();          //

        //Shape shape = new Shape();            // every shape is Not square


        square.getName();
        square.getSide();
        square.getLength();

        square2.getName();                      // able to access parent method
        square2.getLength();                    // able to access own method
        //square2.getSide();                    // can not use child methods!


    }
}
