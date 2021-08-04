package Day21;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // If we want our primitive type to act like non-primitive
        // we use Wrapper Classes

        int primitiveInt = 1;
//    primitiveInt. | there is no method for primitive types
        Integer nonPrimitiveInt = 1;
//    for wrapper classes we have methods because they are non-primitive

//    int cannotAssignNullValue = null;  | we cannot assign null values for primitive types
        Integer canAssignNullValues = null;

        int[] array = new int[2];
        System.out.println(array[0]); // always has a value
        System.out.println(array[1]); // always has a value

        Integer[] arr = new Integer[3];
        System.out.println(arr[0]);  // can be null
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        String nullString = null;
        String notNullString = "String text";

//        System.out.println(nullString.concat(notNullString)); // NullPointer Exception
        System.out.println(nullString + notNullString); // We don't have exception
    }
}
