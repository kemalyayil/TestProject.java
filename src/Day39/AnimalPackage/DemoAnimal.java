package Day39.AnimalPackage;

public class DemoAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal(10,"Bird");
        animal.eat();
        animal.sleep();

        System.out.println(" ");
        Cat cat = new Cat(2,"Oliver");
        cat.eat();
        System.out.println(cat.toString());

        System.out.println(" ");
        Dog dog = new Dog(9,"Bean");
        dog.eat();
        dog.sleep();
        System.out.println(dog.toString());

    }
}
