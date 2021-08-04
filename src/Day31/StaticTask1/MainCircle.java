package Day31.StaticTask1;

import Day31.StaticTask1.Circle;

public class MainCircle {
    public static void main(String[] args) {

        System.out.println("Count of area before = " + Circle.howManyTimesOfArea);
        System.out.println("Count of Circumference before = " + Circle.howManyTimesOfCircumference);

        Circle circle1 = new Circle();
        double areaOfCircle1 =circle1.area();
        System.out.println(areaOfCircle1);      // 0.0 cunku radius a deger vermekdik.
        double circleOfCircle1 = circle1.circumference();
        System.out.println("Circumference of circle1 = " + circleOfCircle1);


        Circle circle2 = new Circle();
        circle2.radius =  10;
        double areaOfCircle2 =circle2.area();
        System.out.println("circle 2 area = " + areaOfCircle2);       // line 12 de radius a deger verdigimiz icin method calisti."314.0"
        double circleOfCircle2 = circle2.circumference();
        System.out.println("Circumference of circle2 = " +circleOfCircle2);

        int howManyTimesArea = Circle.howManyTimesOfArea;
        System.out.println("How many times of Area were used = " + howManyTimesArea);

        int howManyTimesCircumference = Circle.howManyTimesOfCircumference;
        System.out.println("How many times of Circumference were used = " + howManyTimesCircumference);

        int howManyTimesAllMethods= Circle.allCount();    // allCount diye bi method olusturduk. circle class line 24-25
        System.out.println("How many times of All Methods were used   = " + howManyTimesAllMethods);

    }
}
