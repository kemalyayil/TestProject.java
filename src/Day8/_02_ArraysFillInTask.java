package Day8;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Arrays;

public class _02_ArraysFillInTask {
    public static void main(String[] args) {
        // create an array of strings of size 10
        // print the array
        // fill in with value "*"
        // print the array

        String[] myTask = new String[10];
        System.out.println(Arrays.toString(myTask));
        Arrays.fill(myTask ,"*");
        System.out.println(Arrays.toString(myTask));

    }
}
