package Day14;

import java.util.Arrays;

public class _02_Task3 {
    public static void main(String[] args) {

        // declare an array of veggies and initialize it with some values use array = {}
        // print all elements - use for loop
        // part2: make a copy of that array and print it



            // my original array
            String[] veggies = {"Tomato", "Lettuce", "Onion", "Pepper"};

            // printing original array
            for (int i = 0; i < veggies.length; i++){
                System.out.println(veggies[i]);
            }

            // my copy array init by the length of original array
            String[] copyOfVeggies = new String[veggies.length];

//        copyOfVeggies[0] = veggies[0];
//        copyOfVeggies[1] = veggies[1];
//        copyOfVeggies[2] = veggies[2];
//        copyOfVeggies[3] = veggies[3]; // instead of this use for loop below

            // we iterate over original array and copy values to second array
            for (int j = 0; j < veggies.length; j++){
                copyOfVeggies[j] = veggies[j];
            }

            veggies[0] = "Patato"; // this will not change the value of first element in copyOfVeggies array

            System.out.println(Arrays.toString(copyOfVeggies)+" copy ");


            String[] copyByReference = veggies;

            veggies[0] = "null"; // this will affect the first element in copyByReference array

            System.out.println(copyByReference[0]);


        }
    }

