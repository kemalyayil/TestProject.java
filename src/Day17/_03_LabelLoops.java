package Day17;

public class _03_LabelLoops {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3, 4}, {4,5,6}, {7,8}};

        OUTER_LOOP:
        for (int i = 0; i < numbers.length; i++){

            INNER_LOOP:
            for (int j = 0; j < numbers[i].length; j++){

                System.out.println(numbers[i][j]);

                if (true){
                    break; // this will break the inner loop
//                  break OUTER_LOOP; this will break outer loop
            }

            }
        }
    }
}