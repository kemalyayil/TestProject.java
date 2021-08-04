package Day45.ExceptionsTasks.TASK1;

public class Demo {
    public static void main(String[] args) {

        Car toyota = new Car();
        try {                   // buy method has checked exception | try-catch is required
            toyota.buy(CarCondition.NEW);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // drive method has runtime exception, try-catch is NOT required.
        toyota.drive("Snowy");          // RuntimeException: The weather is not good to drive!


    }
}
