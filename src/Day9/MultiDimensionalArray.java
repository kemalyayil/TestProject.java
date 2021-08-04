package Day9;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // this is called one dimensional array
        String[] list1 = {"1","2"};
        String[] list2 = {"3","4"};
        String[] list3 = {"5","6"};

        // 2 dimensional  array
        String[][] listOfLists = {{"1","2"},{"3","4"},{"5","6"}};
        System.out.println(listOfLists); // burada toString e cevirmemiz lazim.
        System.out.println(Arrays.deepToString(listOfLists)); // buarada manual teker teker yapmak yerine hepsini yaptik.

        int[][] ageAngrad = new int[4][2];//age and graduation years // 4 rolls , 2 kalums
        ageAngrad[0][0] = 35;
        ageAngrad[0][1] = 2010;
        ageAngrad[1][0] = 40;
        ageAngrad[1][1] = 2003;
        ageAngrad[2][0] = 60;
        ageAngrad[2][1] = 1985;
        ageAngrad[3][0] = 25;
        ageAngrad[3][1] = 2020;

        System.out.println(Arrays.deepToString(ageAngrad));

//        String[] list1 = {"1", "2", "7"};
//        String[] list2 = {"3", "4", "8"};
//        String[] list3 = {"5", "6", "9"};
//
//        String[][] listOfLists = {{"1", "2", "7"}, {"3", "4", "8"}, {"5", "6", "9"}};
//
//        System.out.println(listOfLists);
//        System.out.println(Arrays.deepToString(listOfLists));
//
//
//        int[][] ageAndGrad = new int[4][2];
//        ageAndGrad[0][0] = 35;
//        ageAndGrad[0][1] = 2010;
//        ageAndGrad[1][0] = 40;
//        ageAndGrad[1][1] = 2003;
//        ageAndGrad[2][0] = 60;
//        ageAndGrad[2][1] = 1985;
//        ageAndGrad[3][0] = 25;
//        ageAndGrad[3][1] = 2020;
//
//        System.out.println(Arrays.deepToString(ageAndGrad));




    }
}
