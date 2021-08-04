package Day39.AnimalPackage;

public class Cat extends Animal{

    public Cat(int age, String name){
        super(age, name);
    }


    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
        System.out.println("Don't make any noise " + name + " will get angry");
    }
}
