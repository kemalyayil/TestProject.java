package Warmup;

public class MainMethod {
    public static void main(String[] args) {

        String str = "I turn to you like a flower leaning towards the sunshine";
        String myStr="";

      int lastSpace = str.lastIndexOf(" ");
        System.out.println(lastSpace);

        myStr = str.substring(lastSpace).trim();

        System.out.println(myStr);
    }
}
