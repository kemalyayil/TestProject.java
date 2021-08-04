package Day38.ShapePackage;

public class Square extends Rectangle{

    public Square(double side){
        super(side,side);
        super.name = "Square : special kind of Rectangle";
    }
}
