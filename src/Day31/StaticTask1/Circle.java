package Day31.StaticTask1;

public class Circle {
    int radius ;
    final double PI = 3.14;             // final makes that you can not change it
    static int howManyTimesOfArea;
    static int howManyTimesOfCircumference;




    public double area(){
        howManyTimesOfArea++;

    return  radius * radius * PI;       // area = radius square times PI
    }

    public double circumference(){
        howManyTimesOfCircumference++;

        return 2 * radius * PI;         //
    }

    public static int allCount (){
        return howManyTimesOfArea + howManyTimesOfCircumference;
    }
}
