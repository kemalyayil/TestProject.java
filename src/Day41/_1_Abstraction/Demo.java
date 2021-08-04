package Day41._1_Abstraction;

public class Demo {

    public static void main(String[] args) {
        //AbstractClass abstractClass = new AbstractClass() ;  // cannot create object for abstract class

        AbstractClass childClass = new ChildClass();
        childClass.abstractMethod();        // able to call the method.



    }
}
