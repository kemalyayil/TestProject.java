package Day28;

public class Main {
    public static void main(String[] args) {

        Dog lucy = new Dog();
        lucy.breed = "Neapolitan Mastiff";
        lucy.size = "Large";
        lucy.age = 5;
        lucy.color = "Black";
        lucy.isSleeping = false;



        Dog max = new Dog();
        max.breed = "Maltese";
        max.size = "Medium";
        max.age = 2;
        max.color = "White";
        max.isSleeping = true;

        lucy.snoring(); // is not sleeping, no print
        max.snoring();// will ZzZzZz

    }

}


