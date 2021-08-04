package Warmup.Warmup2;

public class arrayFront9 {
    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


                arrayFront9([1, 2, 9, 3, 4]) → true
                arrayFront9([1, 2, 3, 4, 9]) → false
                arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(arrayFront9(myArray));

    }

    public static boolean arrayFront9(int[] nums) {
        if (nums.length > 4) {
            return (nums[0] == 9 || nums[1] == 9 || nums[2] == 9 || nums[3] == 9);
        } else if (nums.length == 3) {
            return (nums[0] == 9 || nums[1] == 9 || nums[2] == 9);
        } else if (nums.length == 2) {
            return (nums[0] == 9 || nums[1] == 9);
        } else if (nums.length == 1) {
            return (nums[0] == 9);
        }
        return false;
    }
}
