package Day37.Inheritance;

public class Main {
    public static void main(String[] args) {
        // parent child relation (Super and parent / Child and sub ; they are the same things)


        Animal animal = new Animal("Dog", 5);

        System.out.println(animal.age);
        System.out.println(animal.name);

        animal.eat();
        animal.sleep();



        Animal animal1 = new Cat("Cotton", 3);

        System.out.println(animal1.name);
        System.out.println(animal1.age);

        animal1.eat();
        animal1.sleep();


        Animal animal2 = new Bird("Eagle",15);

        System.out.println(animal2.name);
        System.out.println(animal2.age);
        animal2.eat();
        animal2.sleep();
        System.out.println(" ");

        Animal animal3 = new Donkey("KaraKacan" , 5);
        System.out.println("Animal 3 name = "+ animal3.name);
        System.out.println("Animal 3 age  = "+ animal3.age);
        animal3.eat();
        animal3.sleep();

        System.out.println(" ");

        Animal animal4 = new Mule ("KopGel",6);
        System.out.println("Animal 4 name = "+ animal4.name);
        System.out.println("Animal 4 age  = "+ animal4.age);
        animal4.eat();
        animal4.sleep();
    }

}