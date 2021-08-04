package Day45.ExceptionsTasks;

import java.util.ArrayList;
import java.util.Collections;

public class ExceptionTask3 {
    public static void main(String[] args) {
        // 1) where does exception occur
        // 2) catch and handle specific exception

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0, 1);
        arrayList.add(1, 2);
        arrayList.add(2, 3);
        arrayList.add(3, null);
        //arrayList.get(4);                       //index 4 diye bi index yok, ve exception var.
        try {
            arrayList.get(4);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("The index does not exist!");
        }

        try {
            Collections.max(arrayList);
        }catch (NullPointerException ex){
            System.out.println("Can not get max if there is a null value");
        }

        //Collections.max(arrayList);             // null value varsa, we can not get max value. cuz max value is not comparable

        arrayList.add(1, 2);
        arrayList.add(2, 3);
        arrayList.add(0, null);
        System.out.println(arrayList);

    }
}
