package Day41.AnimalPackage;

public class Dog extends Animal{
    public Dog(String name, int DOB){
        super(name, DOB);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating 3 cups a day");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving 7 miles");
    }

    @Override
    public void makeSound() {
        System.out.println("Wouffff");
    }
}
