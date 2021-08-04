package Day19;

public class _01_MethodsTask {

/*

    -Create an array of size 5, assign some random values
    from 1 to 10 (use random class and for loop to assign values)


||You should create public static void methods for each
(Parameter should be int Array for methods)||

-1-Create a method that prints array like "2 3 1 10 2", space between elements of array
-2-Create a method that prints the sum of an array
-3-Create a method that prints the max element of an array


     */

    public static void main(String[] args) {

        int[] myNumbers = {1, 5, 7, 3, 9};

        printArray(myNumbers);

        sumOfArray(myNumbers);

        maxNumberOfArray(myNumbers);

    }

    // Return Types are void because we are not returning anything - just printing

    // Create a method for printing an array and parameter should be int[] array
    public static void printArray(int[] theArray) {
        for (int j = 0; j < theArray.length; j++){
            System.out.print(theArray[j] + " ");
        }
        System.out.println("");
    }


    public static void sumOfArray(int[] theArray){
        int sum = 0;
        for (int i = 0; i < theArray.length; i++){
            sum += theArray[i];
        }
        System.out.println("The sum of array is: " + sum);
    }


    public static void maxNumberOfArray(int[] theArray){

        int max = theArray[0];

        for (int k = 0; k < theArray.length; k++){

            if (theArray[k] > max)
                max = theArray[k];
        }
        System.out.println("Max number of array is: " + max);

    }
}
