package Day41._1_Abstraction;

public class ChildClass extends AbstractClass{      // this class is not abstract although we extend it

    @Override
    public void abstractMethod(){                   // method is also not abstract
        System.out.println("Child Class");
}



}
