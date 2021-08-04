package Day12;

public class PrimitiveToString {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        System.out.println(x+y); // 3
        System.out.println("My numbers are : " + x+y); // 12
        System.out.println(" " + x+y); // 12 .

        String xToString = Integer.toString(x);
        String yToString = Integer.toString(y);

        System.out.println(xToString + yToString);





    }
}
