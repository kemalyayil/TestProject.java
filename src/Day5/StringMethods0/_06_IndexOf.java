package Day5.StringMethods0;

public class _06_IndexOf {

    public static void main(String[] args) {

        String welcome = "Welcome to TechnoStudy";

        int indexOfE = welcome.indexOf("e");
        System.out.println(indexOfE);

        int indexOfT = welcome.indexOf("T"); // case sensitive. lower case de 8 , uppercase de 11 cikariyor.
        System.out.println(indexOfT);
        System.out.println(welcome.indexOf("e"));


    }
}
