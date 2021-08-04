package Day40.TASK1;

import java.util.ArrayList;

public class DemoAnimal {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Horse());


        for (Animal animal : animals){
            animal.makeSound();
            animal.run(5,"Mile");
            animal.run(5);
        }

        //Create a new kind of bank account called PrivilegedAccount
        //make it possible to overdraft

    }
}
