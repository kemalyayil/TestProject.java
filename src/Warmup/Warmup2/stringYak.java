package Warmup.Warmup2;

public class stringYak {
   /*
   Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


                    stringYak("yakpak") → "pak"
                    stringYak("pakyak") → "pak"
                    stringYak("yak123ya") → "123ya"
    */
   public static void main(String[] args) {
       System.out.println(stringYak("yakpak"));
       System.out.println(stringYak("pakyak"));
       System.out.println(stringYak("yak123ya"));
       System.out.println(stringYak("hakki"));

   }
    public static String stringYak(String str) {
       String myStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 'k'){
                i = i + 2;
            }else{
                myStr = myStr + str.charAt(i);
            }
        }
        return myStr;
    }
}
