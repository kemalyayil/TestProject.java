package Day38.ShapePackage;

public class Circle extends Shape{
    double radius;
    double diameter;

    public Circle(double radius){
        super("Circle");            // shape class line 9-10.
        this.radius = radius;
        super.area=3.14 * radius * radius;
        super.perimeter = 2 * 3.14 * radius;
        this.diameter = 2 * radius;
    }

}
