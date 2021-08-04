package Day28.TaskPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Tekir";
        cat1.age = 1;
        cat1.sound();

        Cat cat2 = new Cat();
        cat2.name = "Lambada";
        cat2.age = 1;
        cat2.sound();

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);

        int sumOfAge = 0;
        for (Cat age : cats){
            sumOfAge += age.age;
        }
        System.out.println(sumOfAge);


        print(cat1); // burada bu sayfada yapip bu asagidan cagirdik.
        print(cat2);

        cat1.printAllProperties(); // cat e yazip cagirdik.
        cat2.printAllProperties();

    }
    public static void print(Cat cat) {
        System.out.println("Name : " + cat.name + " , Age : " + cat.age);
    }

}
