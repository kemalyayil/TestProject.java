package Day33._02_InstanceModifiers.priviateModifier.Same;

import Day30.Car;

public class Cat {

    private String name;

    public Cat(){           // constructor
        name = "Cat";
    }

    private Cat(String name){       // constructor private
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    private String getName(){
        return name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Cengiz");    // line 13. private constructor
        cat.name = "Tombik";            // name kullanabildik. ama bu class disinda kullanamayiz, cunku private.
        System.out.println(cat.name);
        System.out.println(cat.getName());
    }
}
