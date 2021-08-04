package Day45.ExceptionsTasks.TASK1;

public class Car {

    public void buy (CarCondition carCondition) throws Exception{           // throws onemli. yoksa line 8 red-lined

        if (carCondition == CarCondition.OLD)
            throw new Exception("This car is too old!");

        if (carCondition == CarCondition.WASTE)
            throw new Exception("This car is waste!");
    }

    public void drive (String weather){
        if (!weather.equalsIgnoreCase("normal")){
            throw new RuntimeException("The weather is not good to drive!");
        }
    }

}
