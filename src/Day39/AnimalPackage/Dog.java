package Day39.AnimalPackage;

public class Dog extends Animal{

    public Dog(int age, String name){
        super(age, name);
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating");
        System.out.println("After the meal " + name + " will be playing games with you");
    }

    @Override
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    @Override        // bu da object class ta oldugu icin override edebiliriz. "object class" "toString" method u ...
    public String toString(){
        return "Overridden toString method from Object Class in JVM";
    }

}
