package Day42.AnimalPackage;

public class DemoAnimal {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.animalSound();
        cat.sleep();

        System.out.println("========================== ");
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();
    }

}
