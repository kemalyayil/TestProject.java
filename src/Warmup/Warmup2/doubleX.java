package Warmup.Warmup2;

public class doubleX {
    /*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


                    doubleX("axxbb") → true
                    doubleX("axaxax") → false
                    doubleX("xxxxx") → true
     */
    public static void main(String[] args) {
        System.out.println(doubleX("xxxxx"));
    }
    public static boolean doubleX(String str) {

        int firstIndex = str.indexOf('x');
        if (firstIndex + 1 < str.length() && str.charAt(firstIndex+1) == 'x'){
            return true;
        }else {
            return false;
        }


    }
}
