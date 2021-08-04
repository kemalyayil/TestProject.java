package Day33._02_InstanceModifiers.protectedModifier.Same;

public class Person {

    protected String name;

    protected Person(){                 // constructor
        name = "David";
    }

    protected  String getName(){
        return name;
    }
}
