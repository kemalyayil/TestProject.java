package Day39.ShapePackage;

public class Rectangle {
    int area;
    int perimeter;

    public void calculateArea(int length , int width){
        this.area = length * width;
    }

    public void calculatePerimeter(int length, int width){
        this.perimeter = 2 * (length + width);
    }





}
