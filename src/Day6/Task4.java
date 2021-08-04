package Day6;

public class Task4 {
    public static void main(String[] args) {

        // check whether string "Hello, how are you?" is a question

        String checkQuestionMark = "Hello, how are you?";
        boolean endsWith = checkQuestionMark.endsWith("?");
        System.out.println(endsWith);
    }
}
