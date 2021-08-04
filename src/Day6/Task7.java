package Day6;

public class Task7 {
    public static void main(String[] args) {

        // Part1: find out the character at 5th index of String "123456789"
        // Part2: find out the character at 5th index of String "0123456789"

       String numbers = "123456789";
       char index5 = numbers.charAt(5);
        System.out.println(index5);

        String numbers2 = "0123456789";
        char index5Two = numbers2.charAt(5);
        System.out.println(index5Two);
    }
}
