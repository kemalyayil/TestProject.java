package Warmup.Warmup2;

import java.util.Arrays;

public class array123 {
    /*

Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

                array123([1, 1, 2, 3, 1]) → true
                array123([1, 1, 2, 4, 1]) → false
                array123([1, 1, 2, 1, 2, 3]) → true
     */

    public static void main(String[] args) {
        int[] newArray = {1, 1, 2, 3, 1};
        System.out.println(array123(newArray));
    }

    public static boolean array123(int[] nums) {


        for (int i = 0; i < nums.length - 2; i++) {     // - 2 dememizin nedeni, eger num[i] = 1 se ve son index se;
            if(nums[i] == 1 && nums[i+1] ==2 && nums[i+2] == 3){        // nums[i+1] ve nums[i+2] yu arayacak.bulamayinca
                return true;                                // out of bound uyarisi verecek
            }
        }
        return false;
    }

}

