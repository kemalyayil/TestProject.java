package Day29.Task1;

public class MainRectangle {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.length = 12;

      int perimeterOfRectangle = rectangle.perimeter();
        System.out.println("Perimeter = "+ perimeterOfRectangle);

        int areaOfRectangle = rectangle.area();
        System.out.println("Area = " + areaOfRectangle);
    }
}
