package Day42.AnimalPackage;

public class Cat implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Meow meow");
    }

    @Override
    public void sleep() {
        System.out.println("Hor Hor Hor");
    }
}
