package Day14;

public class _01_Task2 {
    // for loops
    public static void main(String[] args) {

        // write a java program which calculates the sum from [0 to 5];
        // using for-loop

        int sum = 0;
        for (int i = 0; i <= 5 ; i++){  // i = 0, i = 1,i = 2,i = 3,i = 4,i = 5
            sum += i; // shortcut of  -- > sum = sum + i
        }
        System.out.println("i = " + sum);
    }
}
