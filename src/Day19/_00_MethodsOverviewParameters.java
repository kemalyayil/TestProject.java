package Day19;

public class _00_MethodsOverviewParameters {
    public static void main(String[] args) {


            int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            int[] array2 = {15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            System.out.println("Start");

            printArray(array1);
            printArray(array2);

            System.out.println("End");

        }

        // using this method we can print any array we want

        public static void printArray(int[] array) {


            for (int i = 0; i < array.length; i++) {

                System.out.println(array[i]);

            }

        }


        // this method is useless because only prints a specific array

        public static void printSpecificArray() {

            int[] array = {15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            for (int i = 0; i < array.length; i++) {

                System.out.println(array[i]);

            }

        }







        }






