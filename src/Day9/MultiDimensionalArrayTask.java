package Day9;

import java.util.Arrays;

public class MultiDimensionalArrayTask {

    public static void main(String[] args) {
         // create 3 dimensional array.
        // store country capital in array

        String [][] capitalsAndCountries = new String[3][2];
        capitalsAndCountries[0][0] = "Berlin";
        capitalsAndCountries[0][1] = "Germany";
        capitalsAndCountries[1][0] = "Paris";
        capitalsAndCountries[1][1] = "France";
        capitalsAndCountries[2][0] = "Buenos Aires";
        capitalsAndCountries[2][1] = "Argentina";
        System.out.println(Arrays.deepToString(capitalsAndCountries));


    }
}
