package Day41.AnimalPackage;

public class DemoAnimal {
    public static void main(String[] args) {

       // Animal animal = new Animal();    // abstract classes cannot create object

        Animal cat = new Cat("Red",2021);
        cat.eat();
        cat.move();
        cat.makeSound();

        System.out.println(" ");

        Animal dog = new Dog("Snow",2019);
        dog.eat();
        dog.move();
        dog.makeSound();

    }
}
