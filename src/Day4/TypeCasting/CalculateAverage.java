package Day4.TypeCasting;

public class CalculateAverage {

    public static void main(String[] args) {

        int student1 = 80;
        int student2 = 95;
        int student3 = 33;
        int student4 = 71;

        int average = (student1+student2+student3+student4)/4; //this is not exact average
        double average2 = (student1+student2+student3+student4)/4.0;
        double average3 = (double) (student1+student2+student3+student4)/4;
        System.out.println(average);
        System.out.println(average2);
        System.out.println(average3);

    }
}
