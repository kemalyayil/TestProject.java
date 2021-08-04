package Day42.AnimalPackage;

public class Dog implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Wof Wof");
    }

    @Override
    public void sleep() {
        System.out.println("ZzZzZzZz");
    }
}
