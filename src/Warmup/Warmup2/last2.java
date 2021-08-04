package Warmup.Warmup2;

public class last2 {
    /*
    Given a string, return the count of the number of times that a substring length 2 appears in the string
    and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

                            last2("hixxhi") → 1
                            last2("xaxxaxaxx") → 1
                            last2("axxxaaxx") → 2

                            son iki karakter in kac tane olup olmadigini test etme.
     */
    public static void main(String[] args) {
        System.out.println(last2("h"));
    }

    public static int last2(String str) {
        int counter = 0;

        if (str.length() > 2) {             // iki karakter ve daha azi 0 olarak otomatik yazdirsin diye.
            String last2 = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(last2)) {    // i+2 nun manasi , 0-2 arasi, 1-3 arasi, 2-4 arasi etc
                    counter++;
                }
            }
        }
        return counter;
    }
}
