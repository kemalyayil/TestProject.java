package Day28;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    boolean isSleeping;

    void setSleeping(){
        isSleeping = true;
    }

    void snoring(){
        if (isSleeping)
            System.out.println("ZzZzZzZzZz...");
    }

}


