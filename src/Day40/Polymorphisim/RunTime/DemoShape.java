package Day40.Polymorphisim.RunTime;

public class DemoShape {
    public static void main(String[] args) {

        Shape[] shapes = {new Shape(),new Circle(), new Rectangle()};     // bu 3 unu diyebiliriz. cunku onlar sub-Class

        for (Shape shape: shapes){
            System.out.println(shape.display());
        }

    }
}
