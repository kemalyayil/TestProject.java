package Day32.ConstructorTask2;

public class MainSquare {
    public static void main(String[] args) {

        Square square1 = new Square();          // 55
        System.out.println(square1.side);

        Square square2 = new Square(10);    //10
        System.out.println(square2.side);
    }
}
