package Day38.ShapePackage;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(5);
        System.out.println(circle.name);
        System.out.println(circle.radius);
        System.out.println(circle.diameter);
        System.out.println(circle.area);
        System.out.println(circle.perimeter);


        Rectangle rectangle = new Rectangle(8,6);
        System.out.println(rectangle.name);
        System.out.println(rectangle.length);
        System.out.println(rectangle.width);
        System.out.println(rectangle.area);
        System.out.println(rectangle.perimeter);


        Square square = new Square(7);
        System.out.println(square.name);
        System.out.println(square.length);
        System.out.println(square.width);
        System.out.println(square.area);
        System.out.println(square.perimeter);

    }
}
