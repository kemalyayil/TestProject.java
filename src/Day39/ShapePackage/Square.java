package Day39.ShapePackage;

public class Square extends Rectangle{

    @Override           // bunu sonradan yazdik. overriding olmasi icin same number of parameter olmasi lazim
    public void calculateArea(int length,int width ){           // to achieve overriding it should be same name
        super.area = length * width;                            // and parameters should be same
    }                                                           // and the classes should be parent-child related
    @Override
    public void calculatePerimeter(int length, int width){
        super.perimeter = 4 * length;    // super demesek de olur . cunku bu sayfada baska parametre yok
    }
    // we can not have less or more parameters.
    // we can not have different  method name .
    // we can not have the classes which dont have parent-child related..



}
