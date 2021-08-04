package Day20;

public class Task2 {

        // Create a method that calculates average of a student in a class
        // inputs: Name, Class Name, multiple Results
        // ex: Ali, Java, 80, 100, 90
        // output: Ali, Java, 90-> (avr)
        // return: Name + ClassName + Average


    public static void main(String[] args) {

        System.out.println(average("Hafid", "Java", 100, 90, 95, 97));

        System.out.println(average("Sinan", "Java", 100, 93.9, 97.3, 90.5, 99.99));


    }


    public static String average(String studentName, String className, int... results) {

        double average;

        int sum = 0;

        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }
        average = (double) sum / results.length;  // yukarda sout da int number girildi. fakat burda decimal olsun diye doble kullandik
        return studentName + " -> " + className + " -> " + average;
    }

    public static String average(String studentName, String className, double... results) {

        double average;

        double sum = 0;

        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }
        average = sum / results.length;
        return studentName + " -> " + className + " -> " + average;
    }
}