package Day29.Task1;

public class Rectangle {

    int length;
    int width;

    public int perimeter() {
        int perimeter2 = (length + width) * 2;
        return perimeter2;
        //return width *2 + length *2;  // aynisi
    }

    public int area(){
        //int area2 = length * width;
        return width * length;
    }
}
