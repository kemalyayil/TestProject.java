package Warmup;

public class ForLoop_ReverseIt {
    public static void main(String[] args) {
        String myString = "Chocolate";

        char[] reverseCh = myString.toCharArray();
        String reversedOrder= "";

        for (int i = reverseCh.length - 1; i >= 0 ; i--) {
           reversedOrder += reverseCh[i];
        }
        System.out.println(reversedOrder);

    }
}
