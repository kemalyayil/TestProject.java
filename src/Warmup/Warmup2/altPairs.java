package Warmup.Warmup2;

public class altPairs {
    /*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


                    altPairs("kitten") → "kien"
                    altPairs("Chocolate") → "Chole"
                    altPairs("CodingHorror") → "Congrr"
     */
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));

    }
        public static String altPairs(String str) {

        String myStr = "";
            for (int i = 0; i < str.length(); i+=4) {
                myStr = myStr + str.charAt(i);
                if (str.length() > i+1){
                    myStr = myStr + str.charAt(i+1);
                }
            }
            return myStr;
        }

}
