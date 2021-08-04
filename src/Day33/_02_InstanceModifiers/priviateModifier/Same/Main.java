package Day33._02_InstanceModifiers.priviateModifier.Same;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.printName();   // it is a public method. able to call this method.



        // cat.name // not able to access this one. line 7 Cat Class. because it is private
        // cat.getName // not able to access this one. line 21 Cat Class. because it is private too

        // Cat cat2 = new Cat("Kitty");   // bunu da yazamayiz. cunku private. line 13 Cat class

    }
}
