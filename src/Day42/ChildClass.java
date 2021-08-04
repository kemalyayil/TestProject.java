package Day42;
/*
if a class needs to inherit from interface , it should use "implement" keyword.
Class can not have multiple inheritance. but interface can.


 */


public class ChildClass implements ParentInterface{
    @Override
    public void method() {
        System.out.println("Method");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }
}
