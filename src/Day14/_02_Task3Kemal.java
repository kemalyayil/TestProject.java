package Day14;

import Day5.StringCasting;

import java.util.Arrays;

public class _02_Task3Kemal {
    public static void main(String[] args) {

        // declare an array of veggies and initialize it with some values use array = {}
        // print all elements - use for loop
        // part2: make a copy of that array and print it

        String[] veggies = {"Tomato", "Lettuce", "Onion", "Pepper"};

        for (int i = 0; i < veggies.length; i++) {
            System.out.println(veggies[i]);
        }
            //copy
            //  System.out.println("");

            String[] copied = new String[veggies.length];

            for (int j = 0; j < veggies.length; j++) {
                copied = veggies;
                System.out.print(copied[j]);
            }

        }

    }
