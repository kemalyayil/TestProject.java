package Day17;

public class _02_Task {
    public static void main(String[] args) {
//String[][] strArray = {{"abc","def","ghi"}, {"jkl", "mno", "prs"}}; print it by for loop
        String[][] strArray = {{"abc", "def", "ghi"}, {"jkl", "mno", "prs"}};

        OUTER_LOOP:
        for (int i = 0; i < strArray.length; i++) {

            INNER_LOOP :
            for (int j = 0; j < strArray[i].length; j++) {

                //System.out.println(strArray[i][j]);  // i stands for 2 arrays
                                                     // j stands for elements in arrays

                for (int k = 0; k < strArray[i][j].length(); k++) {
                    System.out.println(strArray[i][j].charAt(k)); // bu advanced . k ile herbir harfi aldik
                }

            }
        }
    }
}