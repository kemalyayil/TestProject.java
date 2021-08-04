package Day6;

public class Task10 {
    public static void main(String[] args) {

        String myString = "Hello to Techno Study!";
        int lastIndexOfSpace = myString.lastIndexOf(" "); // burada space var
        String result = myString.substring(lastIndexOfSpace +1);
        System.out.println(result);




    }
}
