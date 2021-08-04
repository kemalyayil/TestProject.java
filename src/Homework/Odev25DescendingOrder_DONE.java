package Homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Odev25DescendingOrder_DONE {
    public static void main(String[] args) {
        /*
    Write a program that uses a for loop to display numbers in descending order in the step of 5 starting from 100.

    e.g., The output should be:

            100

            95

            90

            ...

            ...

            5

            0

     */

        for (int i = 100; i > 0; i--) {         // that is the keypoint. pay attention
            if (i % 5 == 0) {                                  // i = i-5
                System.out.println("" + i);
            }
        }


    }
}
