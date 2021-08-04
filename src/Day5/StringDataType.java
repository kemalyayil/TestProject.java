package Day5;

public class StringDataType {

    public static void main(String[] args) {

        String name = "Hello World";
        System.out.println(name);

        String schoolName = "TechnoStudy";
        String courseName = "SDET Course";
        System.out.println(schoolName + " " +courseName + "Java");

        String question = "What is your age?";
        String answer = "My age is:";
        int age= 25;
        System.out.println(question + "\n" + answer + age); // Java converts 'age' into string.

        int dateOfBirth = 1990;
        double height = 6.7;
        char gender = 'M';
        System.out.println(dateOfBirth + height + gender); // calculation will occur here.the result is 2073.7
        System.out.println("" + dateOfBirth + height + gender);//will convert everything to string.


    }
}
